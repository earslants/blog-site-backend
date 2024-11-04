package com.emirhanarslantas.blogsite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Content {
    @Id
    private Long id;
    private String title;
    private String category;
    private LocalDateTime dateTime;
    private String text;

    public Content(Long id, String title, String category, LocalDateTime dateTime, String text) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.dateTime = dateTime;
        this.text = text;
    }

    public Content() {
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public String getText() {
        return this.text;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setText(String text) {
        this.text = text;
    }
}
