package com.example.projettutospring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tutorials")
public class Tutorial {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Boolean isPublished;

    public Tutorial() {
    }

    public Tutorial(String title, String description, Boolean isPublished) {
        this.title = title;
        this.description = description;
        this.isPublished = isPublished;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPublished() {
        return isPublished;
    }

    public void setPublished(Boolean published) {
        isPublished = published;
    }
}
