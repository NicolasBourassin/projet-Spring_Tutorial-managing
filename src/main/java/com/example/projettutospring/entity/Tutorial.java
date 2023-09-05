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
    private Boolean published;

    public Tutorial() {
    }

    public Tutorial(String title, String description, Boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public Tutorial(Long id, String title, String description, Boolean published) {
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
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }

}
