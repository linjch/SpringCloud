package com.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.spring.application.filter.TokenFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args){
		SpringApplication.run(ZuulApplication.class, args);
	}
	
	@Bean
	public TokenFilter tokenFilter(){
		return new TokenFilter();
	}
}
