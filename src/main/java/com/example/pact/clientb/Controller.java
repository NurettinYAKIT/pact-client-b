package com.example.pact.clientb;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUsers() {
        return "[{\"name\": \"John\"}, {\"name\": \"Jane\"}]";
    }
}
