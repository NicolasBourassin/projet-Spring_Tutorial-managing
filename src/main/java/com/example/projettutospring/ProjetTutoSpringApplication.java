package com.example.projettutospring;

import com.example.projettutospring.entity.Tutorial;
import com.example.projettutospring.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.List;


@SpringBootApplication
public class ProjetTutoSpringApplication implements CommandLineRunner {
    @Autowired
    private TutorialRepository tutorialRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetTutoSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Tutorial myTuto1 = new Tutorial();
//        myTuto1.setTitle("Spring 1");
//        myTuto1.setDescription("description 1");
//        myTuto1.setPublished(true);
//        tutorialRepository.save(myTuto1);
//        Tutorial myTuto2 = new Tutorial();
//        myTuto2.setTitle("Spring 2");
//        myTuto2.setDescription("description 2");
//        myTuto2.setPublished(false);
//        tutorialRepository.save(myTuto2);
//
//        List<Tutorial> selection1 = tutorialRepository.findTutorialsByPublished(true);
//        System.out.println("selection 1 : "+
//                selection1.toString());
//
//        List<Tutorial> selection2 = tutorialRepository.findTutorialsByTitleContains("Spring 2");
//        System.out.println("selection 2 : "+
//                selection2.toString());


    }

}
