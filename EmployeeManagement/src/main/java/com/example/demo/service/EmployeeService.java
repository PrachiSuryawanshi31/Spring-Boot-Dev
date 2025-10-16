package com.example.demo.service;

import com.example.demo.entity.Employee;

public class EmployeeService {
	
	public String saveEmployee()
	{
		return "Employee saved in database";
	}
	
	public Employee getEmployee()
	{
		Employee E1=new Employee();
		
		E1.seteName("Prachi");
		E1.seteAddress("Latur");
		E1.seteId(3221);
		E1.seteDept("IT");
		E1.seteMobNo(1346786453);
		
		return E1;
			
	}

}
