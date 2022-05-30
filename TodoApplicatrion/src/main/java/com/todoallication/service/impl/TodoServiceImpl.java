package com.todoallication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoallication.entity.Todo;
import com.todoallication.repository.TodoRepository;
import com.todoallication.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	TodoRepository todoRepository;
	@Override
	public Todo saveTodo(Todo todo) {
		 
		return todoRepository.save(todo);
	}

}
