package com.todoallication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoallication.entity.Todo;
 

public interface TodoRepository  extends JpaRepository  <Todo,Long>{
}
