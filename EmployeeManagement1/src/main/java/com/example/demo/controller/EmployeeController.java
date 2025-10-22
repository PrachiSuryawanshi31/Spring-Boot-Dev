package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeImpl;
	
	@PostMapping("addEmployee")
	Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeImpl.saveEmployee(employee);
		
	}
	

}
