package com.paritosh.TestRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paritosh.TestRest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	

}
