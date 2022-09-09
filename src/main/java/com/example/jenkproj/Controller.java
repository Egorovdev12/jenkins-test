package com.example.jenkproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    // базовый слой
    @GetMapping("/hello")
    public List<String> hello() {
        return List.of("Hello", ", World!");
    }

    @GetMapping("/rushello")
    public List<String> rushello() {
        return List.of("Zdarova!", "Privet!", "Zdravstvuy!");
    }
}