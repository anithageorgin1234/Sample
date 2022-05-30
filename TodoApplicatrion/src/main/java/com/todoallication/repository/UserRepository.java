package com.todoallication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoallication.entity.UserRegistration;

 

public interface UserRepository extends JpaRepository  <UserRegistration,Long>{
}
