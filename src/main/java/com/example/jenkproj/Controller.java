package com.example.jenkproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    // базовый слой
    @GetMapping("/hello")
    public List<String> hello() {
        return List.of("Hello", ", World!");
    }

    @GetMapping("/rushello")
    public List<String> rushello() {
        return List.of("Zdarova!", "Privet!", "Zdravstvuy!");
    }

    @GetMapping("/sum")
    public List<Integer> getSum(@RequestParam int n1, int n2) {
        return List.of(service.calculate(n1, n2));
    }
}