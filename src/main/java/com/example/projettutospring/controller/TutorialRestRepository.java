package com.example.projettutospring.controller;

import com.example.projettutospring.entity.Tutorial;
import com.example.projettutospring.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tutorials")

public class TutorialRestRepository{
    @Autowired
    private TutorialRepository tutorialRepository;

    @GetMapping
    public List<Tutorial> all(){
        return tutorialRepository.findAll();
    }
}
