package com.spring.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${test.service.name}")
	private String name;

	@RequestMapping("/hello")
	public String hello(){
		return "hello " + name;
	}
}
