package com.paritosh.TestRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paritosh.TestRest.Exception.EmployeeExceptionHandle;
import com.paritosh.TestRest.model.Employee;
import com.paritosh.TestRest.service.EmployeeService;

@RestController
@RequestMapping("/Company")
public class EmployeeController 
{
	@Autowired
	EmployeeService empservice;
	
    @PostMapping("/Employee")
	public Employee addemp(@RequestBody Employee emp) 
    {
    	return empservice.save(emp);
    }
    
    @GetMapping("/Employee")
    public List<Employee> getall()
    {
    	System.out.println("test success");
    	return empservice.getall();
    }
    
    @GetMapping("Employee/{id}")
    public Optional<Employee> GetbyId(@PathVariable Long id) 
    {
    	Optional<Employee> emp = empservice.findbyId(id);
    	if(!emp.isPresent()) throw new EmployeeExceptionHandle("id" + id);
    	else 
    	return emp;
    	
    }
}
