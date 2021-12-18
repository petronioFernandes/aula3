package com.example.aula3.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;

@Entity
@Table(name = "Projetos")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Projeto() {
    }

    public Projeto(String name, String description, boolean published) {
        this.name = name;
        this.description = description;
        this.published = published;
    }

    public long getById() {
        return id;
    }

    public String getByTitle() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getByDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Projeto Fuctura id: " + id + ", name: " + name + ", published: "
                + published + ", description: " + description;
    }

}
