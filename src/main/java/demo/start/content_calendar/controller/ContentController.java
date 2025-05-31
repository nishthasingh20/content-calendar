package demo.start.content_calendar.controller;

import demo.start.content_calendar.model.Content;
import demo.start.content_calendar.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repo;

    public ContentController(ContentCollectionRepository repo) {
        this.repo = repo;
    }

    //enabling to make a request and find all content:
    @GetMapping("")
    public List<Content> findAll() {
        return repo.findAll();
    }

}
