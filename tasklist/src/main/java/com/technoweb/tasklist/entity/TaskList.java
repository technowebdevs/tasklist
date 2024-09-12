package com.technoweb.tasklist.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class TaskList {

	public enum ListType {
		TODO,
		REMINDER
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "list_id")
	private Long listId;
	
	@Column(name = "list_name")
	private String listName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonIgnore
    private User createdBy;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @Enumerated(EnumType.STRING)
	@Column(name = "type", nullable = false)
	private ListType type = ListType.TODO;
    
	@OneToMany(mappedBy = "list", fetch = FetchType.LAZY)
	private Set<ListParticipant> participants;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "list_id")
	private Set<Items> items;


}
