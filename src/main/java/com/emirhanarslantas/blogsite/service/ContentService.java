package com.emirhanarslantas.blogsite.service;

import com.emirhanarslantas.blogsite.dto.ContentByIdDto;
import com.emirhanarslantas.blogsite.dto.ContentDto;
import com.emirhanarslantas.blogsite.entity.Content;

import java.util.List;

public interface ContentService {
    List<ContentDto> getAll();

    ContentByIdDto getContentById(Long id);
}
