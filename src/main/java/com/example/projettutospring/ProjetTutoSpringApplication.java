package com.example.projettutospring;

import com.example.projettutospring.entity.Tutorial;
import com.example.projettutospring.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class ProjetTutoSpringApplication implements CommandLineRunner {
    @Autowired
    private TutorialRepository tutorialRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetTutoSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tutorial myTuto1 = new Tutorial();
        myTuto1.setTitle("Spring");
        myTuto1.setDescription("blabla");
        myTuto1.setPublished(true);
        tutorialRepository.save(myTuto1);
    }

}
