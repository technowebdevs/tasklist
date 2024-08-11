package com.technoweb.tasklist.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity
public class Lists {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "list_id")
	private Long listId;
	
	@Column(name = "list_name")
	private String listName;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;
	
    @Override
    public String toString() {
    	return this.listId + ", " + this.listName;
    }
	
	
}
