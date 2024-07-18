package com.technoweb.tasklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoweb.tasklist.entity.Lists;
import com.technoweb.tasklist.service.ListsService;

@RestController
@RequestMapping("/lists")
public class ListsController {

	@Autowired
	private ListsService service;

	@GetMapping
	public ResponseEntity<List<Lists>> getListOfLists() {
		
		return ResponseEntity.ok(service.getAllLists());
	}
}
