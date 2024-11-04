package com.emirhanarslantas.blogsite.dto;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class ContentDto {
    @Id
    private Long id;
    private String title;
    private String category;
    private LocalDateTime dateTime;

    public ContentDto(Long id, String title, String category, LocalDateTime dateTime) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.dateTime = dateTime;
    }

    public ContentDto() {
    }

}
