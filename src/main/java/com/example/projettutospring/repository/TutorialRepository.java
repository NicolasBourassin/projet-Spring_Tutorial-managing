package com.example.projettutospring.repository;

import com.example.projettutospring.entity.Tutorial;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Function;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findTutorialsByPublished(Boolean isPublished);

    List<Tutorial> findTutorialsByTitle(String title);
}
