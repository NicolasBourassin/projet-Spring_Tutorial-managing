package com.example.projettutospring.repository;

import com.example.projettutospring.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findTutorialsByPublished(Boolean isPublished);

    List<Tutorial> findTutorialsByTitleContaining(String title);
}
