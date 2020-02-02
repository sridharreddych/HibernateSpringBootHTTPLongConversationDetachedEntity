package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}


/*
HTTP Long Conversation Via Versioned Optimistic Locking And Detached Entities In The HTTP Session

Description: This is a sample application that shows how to take advantage of versioned optimistic locking and detached entities in HTTP long conversations. The climax consists of storing the detached entities across multiple HTTP requests. Commonly, this can be accomplished via HTTP session.

Key points:

prepare the entity via @Version
rely on @SessionAttributes for storing the detached entities
Sample output (check the message caused by optimistic locking exception):

*/