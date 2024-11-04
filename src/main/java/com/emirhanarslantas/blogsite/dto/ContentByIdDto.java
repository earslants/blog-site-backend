package com.emirhanarslantas.blogsite.dto;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class ContentByIdDto {

    @Id
    private Long id;
    private String title;
    private String category;
    private LocalDateTime dateTime;
    private String text;


    public ContentByIdDto(Long id, String title, String category, LocalDateTime dateTime, String text) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.dateTime = dateTime;
        this.text = text;
    }

    public ContentByIdDto() {}

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
