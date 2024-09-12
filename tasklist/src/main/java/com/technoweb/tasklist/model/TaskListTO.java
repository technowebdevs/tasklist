package com.technoweb.tasklist.model;

import java.util.HashSet;
import java.util.Set;

import com.technoweb.tasklist.entity.TaskList;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class TaskListTO {

	private Long listId;
	
	private String listName;
	
	//private String type;
	
	private Set<UserTO> participants;
	
	private Set<ItemTO> items;
	
	public static TaskListTO convertEntity(TaskList entity) {
		
		Set<UserTO> participants = new HashSet<>();
		entity.getParticipants().forEach(p -> participants.add(UserTO.convertParticipantEntity(p)));

		Set<ItemTO> items = new HashSet<>();
		entity.getItems().forEach(i -> items.add(ItemTO.convertEntity(i)));

		
		return TaskListTO.builder()
				.listId(entity.getListId())
				.listName(entity.getListName())
				.participants(participants)
				.items(items)
				.build();
	}
}
