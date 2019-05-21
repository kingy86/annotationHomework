package com.codeclan.annotationHomework.annotationHomework.models;

import javax.persistence.*;

@Entity
@Table(name="annotationHomework")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="extension")
    private String extension;

    @Column(name="size")
    private int size;

    public File(String title, String extension, int size) {
        this.title = title;
        this.extension = extension;
        this.size = size;
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
