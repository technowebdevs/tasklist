package com.technoweb.tasklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoweb.tasklist.entity.TaskList;

@Repository
public interface ListsRepository extends JpaRepository<TaskList, Long> {

}
