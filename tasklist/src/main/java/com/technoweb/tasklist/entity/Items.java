package com.technoweb.tasklist.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Items {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long itemId;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "list_id")
	private Long listId;

	@OneToOne
	@JoinColumn(name = "user_id")
    @JsonIgnore
    private User assignee;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

	@Column(name = "status")
	private String status;

	@Column(name = "note")
	private String note;
	
    @ManyToOne(fetch = FetchType.LAZY)
    private TaskList list;



}
