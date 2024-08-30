package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
    private static final String template = "Hello, %s!";


    @GetMapping("/user")
    public User user(@RequestParam(value = "name", defaultValue = "hoàng") String name,
                     @RequestParam(value = "age", defaultValue = "20") int age,
                     @RequestParam(value = "score", defaultValue = "1000") long score) {
        return new User(String.format(template, name), age, score);
    }
}
