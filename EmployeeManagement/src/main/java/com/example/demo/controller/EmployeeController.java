package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	EmployeeService EC=new EmployeeService();
	
	@PostMapping("addEmployee")
	String addEmployee(@RequestBody Employee employee)
	{
		return EC.saveEmployee();
	}
	
	@GetMapping("getEmployee")
	Employee getEmployee()
	{
		return EC.getEmployee();
	}
	
}
