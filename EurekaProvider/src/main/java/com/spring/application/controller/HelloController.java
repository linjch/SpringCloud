package com.spring.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
    String hello(String name) {
        return "Hello " + name + "!";
    }
}
