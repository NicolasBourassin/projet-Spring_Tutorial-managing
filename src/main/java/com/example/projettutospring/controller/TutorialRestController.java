package com.example.projettutospring.controller;

import com.example.projettutospring.entity.Tutorial;
import com.example.projettutospring.repository.TutorialRepository;
import org.hibernate.annotations.SQLDeleteAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/")
public class TutorialRestController {
    @Autowired
    private TutorialRepository tutorialRepository;

    @GetMapping(value = "tutorials")
    public List<Tutorial> getAll(){
        List<Tutorial> results = tutorialRepository.findAll();
        if(results.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        return results;
    }

    @ResponseBody
    @GetMapping(value = "tutorials/title")
    public List<Tutorial> getByTitle(@RequestParam String title){
        List<Tutorial> results =tutorialRepository.findTutorialsByTitleContains(title);
        if(results.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return results;
    }

    @GetMapping(value = "tutorials/{id}")
    public Optional<Tutorial> getById(@PathVariable Long id) {
        Optional<Tutorial> result = tutorialRepository.findById(id);
        // NOTE : l'usage de Optional<> permet result.isEmpty() et non result==null
        if(result.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return result;
    }

    @PostMapping(value = "tutorials")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Tutorial tutorial) {
        tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), tutorial.getPublished()));
    }

    @PutMapping(value = "tutorials/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@PathVariable Long id, @RequestBody Tutorial tutorial) {
        Optional<Tutorial> result = tutorialRepository.findById(id);
        if (result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        tutorialRepository.save(new Tutorial(id, tutorial.getTitle(), tutorial.getDescription(), tutorial.getPublished()));
    }

    @DeleteMapping("tutorials/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        Optional<Tutorial> result = tutorialRepository.findById(id);
        if(result.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        tutorialRepository.deleteById(id);
    }

    @DeleteMapping("tutorials")
    public void deleteAll() {
        List<Tutorial> result = tutorialRepository.findAll();
        if(result.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        tutorialRepository.deleteAll();
    }

}