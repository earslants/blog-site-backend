package com.emirhanarslantas.blogsite.service;
import com.emirhanarslantas.blogsite.dto.ContentByIdDto;
import com.emirhanarslantas.blogsite.dto.ContentDto;
import com.emirhanarslantas.blogsite.entity.Content;
import com.emirhanarslantas.blogsite.repository.ContentRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {
    private final ContentRepository contentRepository;

    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }


    private List<ContentDto> mapContent(List<Content> content) {
        List<ContentDto> contentList = new ArrayList<>();
        for (Content value : content) {
            ContentDto contentDto = new ContentDto();
            contentDto.setId(value.getId());
            contentDto.setCategory(value.getCategory());
            contentDto.setTitle(value.getTitle());
            contentDto.setDateTime(value.getDateTime());

            contentList.add(contentDto);
        }

        return  contentList;
    }

    private ContentByIdDto mapContentByIdDto(Content content) {
        ContentByIdDto contentByIdDto = new ContentByIdDto();
        contentByIdDto.setId(content.getId());
        contentByIdDto.setTitle(content.getTitle());
        contentByIdDto.setCategory(content.getCategory());
        contentByIdDto.setDateTime(content.getDateTime());
        contentByIdDto.setText(content.getText());

        return contentByIdDto;
    }
;
    @Override
    public List<ContentDto> getAll() {
        List<Content> all = contentRepository.findAll();
        return mapContent(all);
    }

    @Override
    public ContentByIdDto getContentById(Long id) {
        Content content = contentRepository.findById(id).orElseThrow(() -> new RuntimeException("Error"));
        return mapContentByIdDto(content);
    }
}
