package com.learning.web.controller;

import com.learning.web.vo.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public HelloResponse hello(@RequestParam(defaultValue = "Spring Boot") String name) {
        return new HelloResponse("Hello, " + name);
    }
}
