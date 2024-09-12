package com.technoweb.tasklist.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class User {

	@Id
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "user_name")
	private String userName;

	@Column(name = "gender")
	private String gender;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private Set<ListParticipant> participantInLists;
}
