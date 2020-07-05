package com.paritosh.TestRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paritosh.TestRest.dao.EmployeeRepository;
import com.paritosh.TestRest.model.Employee;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository emprepo;
	
	public Employee save(Employee emp) 
	{
		return emprepo.save(emp);
	}
	
	public List<Employee> getall() 
	{
		List<Employee> emp = emprepo.findAll();
		return emp;
	}
	
	public Optional<Employee> findbyId(Long id) 
	{
		Optional<Employee> emp = emprepo.findById(id);
		return emp;
	}
}
