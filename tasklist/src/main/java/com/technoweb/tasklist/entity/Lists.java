package com.technoweb.tasklist.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
