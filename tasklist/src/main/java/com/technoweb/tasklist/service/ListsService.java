package com.technoweb.tasklist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoweb.tasklist.entity.Lists;
import com.technoweb.tasklist.repository.ListsRepository;

@Service
public class ListsService {

	@Autowired
	public ListsRepository repo;
	
	public List<Lists> getAllLists() {
		
		List<Lists> l = repo.findAll();
		
		System.out.println(l);
		
		return l;
	}
}
