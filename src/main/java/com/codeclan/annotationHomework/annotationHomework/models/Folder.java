package com.codeclan.annotationHomework.annotationHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @JsonIgnore
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private ArrayList<File> files;

    @JsonIgnoreProperties("folders")
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    public Folder() {
    }

    public Folder(String title) {
        this.title = title;
        this.files = new ArrayList<File>();
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

     public List<File> getFiles() {
        return files;
    }
}
