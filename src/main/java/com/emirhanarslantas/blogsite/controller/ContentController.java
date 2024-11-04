package com.emirhanarslantas.blogsite.controller;
import com.emirhanarslantas.blogsite.dto.ContentByIdDto;
import com.emirhanarslantas.blogsite.dto.ContentDto;
import com.emirhanarslantas.blogsite.service.ContentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {

    private final ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAll() {
        List<ContentDto> contents = contentService.getAll();
        return ResponseEntity.ok(contents);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getContentById(@PathVariable("id") Long id) {
        ContentByIdDto contentById = contentService.getContentById(id);
        return ResponseEntity.ok(contentById);
    }
}
