package com.avinashk.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/")
public class TestRestAPI {
	
	@Autowired
	ConfigProperties prop;
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello World";
	}
	
	@GetMapping("/name")
	public String name() {
		return prop.getAppName();
	}
	
	@GetMapping("/desc")
	public String description() {
		return prop.getDescription();
	}
}
