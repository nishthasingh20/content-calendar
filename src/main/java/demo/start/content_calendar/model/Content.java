package demo.start.content_calendar.model;

import java.time.LocalDateTime;

public record Content(
    Integer id,
    String desc,
    String title,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
) {}