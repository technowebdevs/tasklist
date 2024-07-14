package com.technoweb.tasklist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lists")
public class ListsController {


	@GetMapping
	public String getListOfLists() {
		
		return "Hello";
	}
}
