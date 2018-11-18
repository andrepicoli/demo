package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
/*
	@GetMapping("/books")
	public String getName() {
		return "Book name 1";
	}*/
	
	@RequestMapping("/")
	public String login(Map<String, Object> model) {
		return "login";
	}
	
	@RequestMapping("/")
	public String dashboard(Map<String, Object> model) {
		return "dashboard";
	}
	
}
