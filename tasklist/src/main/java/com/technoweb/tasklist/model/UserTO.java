package com.technoweb.tasklist.model;

import com.technoweb.tasklist.entity.ListParticipant;
import com.technoweb.tasklist.entity.User;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class UserTO {

	private Long userId;
	
	private String userName;
	
	public static UserTO convertEntity(User entity) {
		return UserTO.builder()
				.userId(entity.getUserId())
				.userName(entity.getUserName())
				.build();
	}

	public static UserTO convertParticipantEntity(ListParticipant entity) {
		return UserTO.builder()
				//.userId(entity.getUser().getUserId())
				//.userName(entity.getUser().getUserName())
				.build();
	}

}
