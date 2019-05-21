package com.codeclan.annotationHomework.annotationHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private ArrayList<Folder> folders;

    public User() {
    }

    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
