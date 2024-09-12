package com.technoweb.tasklist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoweb.tasklist.entity.TaskList;
import com.technoweb.tasklist.model.TaskListTO;
import com.technoweb.tasklist.repository.ListsRepository;

@Service
public class ListsService {

	@Autowired
	public ListsRepository repo;
	
	public List<TaskListTO> getAllLists() {
		List<TaskList> l = repo.findAll();
		List<TaskListTO> lstTO = new ArrayList<>(); 
		l.forEach(en -> lstTO.add(TaskListTO.convertEntity(en)));
		return lstTO;
	}
}
