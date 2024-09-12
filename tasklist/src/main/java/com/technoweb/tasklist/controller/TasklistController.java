package com.technoweb.tasklist.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoweb.tasklist.entity.TaskList;
import com.technoweb.tasklist.model.ItemTO;
import com.technoweb.tasklist.model.TaskListTO;
import com.technoweb.tasklist.model.UserTO;
import com.technoweb.tasklist.service.ListsService;

@RestController
@RequestMapping("/tasklist")
public class TasklistController {

	@Autowired
	private ListsService service;

	@GetMapping
	public ResponseEntity<List<TaskListTO>> getListOfLists() {
		return ResponseEntity.ok(service.getAllLists());
	}

	@PostMapping
	public TaskListTO createTaskList(TaskListTO taskListTO, UserTO createdBy) {

		return taskListTO;
	}

	@PutMapping("/{listId}/updateName")
	public void updateTaskListName(@PathVariable Long listId, String taskListName) {

		
	}

	@PutMapping("/{listId}/addItems")
	public TaskListTO addItems(@PathVariable Long listId, Set<ItemTO> items) {

		return null;
	}

	@PutMapping("/{listId}/removeItem/{itemId}")
	public TaskListTO removeItem(@PathVariable Long listId, @PathVariable Long itemId) {

		return null;
	}

	@PutMapping("/{listId}/updateItem/{itemId}")
	public TaskListTO updateItem(@PathVariable Long listId, @PathVariable Long itemId, ItemTO item) {

		return null;
	}

}
