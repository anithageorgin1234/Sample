package com.greatlearning.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.security.entity.Employee;

 

public interface EmployeeRepository extends JpaRepository  <Employee,Long>{

}
