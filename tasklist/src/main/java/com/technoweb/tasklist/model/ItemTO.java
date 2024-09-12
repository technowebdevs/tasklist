package com.technoweb.tasklist.model;

import java.time.ZoneId;

import com.technoweb.tasklist.entity.Items;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class ItemTO {
	
	private String itemName;

    private UserTO assignee;

    private Long dueDate;

	private String status;

	private String note;

	public static ItemTO convertEntity(Items entity) {
		
		return ItemTO.builder()
				.itemName(entity.getItemName())
				.assignee(UserTO.convertEntity(entity.getAssignee()))
				.dueDate(entity.getDueDate().atZone(ZoneId.systemDefault()).toEpochSecond())
				.status(entity.getStatus())
				.note(entity.getNote())
				.build();
	}
	
}
