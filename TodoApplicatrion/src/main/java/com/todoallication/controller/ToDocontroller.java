package com.todoallication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todoallication.entity.Todo;
import com.todoallication.service.TodoService;

@RestController 
public class ToDocontroller {
	
	@Autowired
	TodoService todoService;
    
	
	
    @PostMapping("/todo")
   public Todo createTodo(@RequestBody Todo todo)
   {
    	return todoService.saveTodo(todo);
   }

}
