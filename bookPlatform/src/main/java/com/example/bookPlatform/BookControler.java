package com.example.bookPlatform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControler {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
