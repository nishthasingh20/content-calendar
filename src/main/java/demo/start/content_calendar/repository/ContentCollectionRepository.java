package demo.start.content_calendar.repository;

import demo.start.content_calendar.model.Content;
import demo.start.content_calendar.model.Status;
import demo.start.content_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;

@Repository
public class ContentCollectionRepository {
    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    //function to find all the content probably
    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id) {
        //if the id of content matches with the given id, return the content.
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content c = new Content(
    1,                                      // id
    "My first blog post. Please support",   // desc
    "My First Blog",                        // title
    Status.IDEA,                            // status
    Type.ARTICLE,                           // contentType
    LocalDateTime.now(),                    // dateCreated
    null,                                   // dateUpdated
    ""                                      // url
);

        content.add(c);
    }
}