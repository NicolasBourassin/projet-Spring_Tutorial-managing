package com.example.projettutospring.service;

import com.example.projettutospring.entity.Tutorial;
import com.example.projettutospring.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {
    @Autowired
    private TutorialRepository tutorialRepository;

    public List<Tutorial> fetchAll(){
        return tutorialRepository.findAll();
    }
}
