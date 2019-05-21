package com.codeclan.annotationHomework.annotationHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
}
