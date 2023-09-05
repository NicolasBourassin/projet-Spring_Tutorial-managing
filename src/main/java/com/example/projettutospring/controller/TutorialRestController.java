package com.example.projettutospring.controller;

import com.example.projettutospring.entity.Tutorial;
import com.example.projettutospring.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

        return tutorialRepository.findTutorialsByTitleContains(title);
    }

    @GetMapping(value = "tutorials/{id}")
    public Optional<Tutorial> getById(@PathVariable Long id) {
        return tutorialRepository.findById(id);
    }

    @PostMapping(value = "tutorials")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Tutorial tutorial) {
        tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), tutorial.getPublished()));
    }
}