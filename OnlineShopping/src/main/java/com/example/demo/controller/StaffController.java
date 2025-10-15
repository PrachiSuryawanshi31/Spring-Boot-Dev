package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
public class StaffController {
	
	@PostMapping("addStaff")
	String addStaff(@RequestBody Staff  staff)
	{
		StaffService ss =new StaffService();
		return ss.saveStaff(staff);
	}
	
	
	Staff getStaff()
	{
		Staff s1 =new Staff();
		
		s1.setsName("Prachi");
		s1.setsAddress("Latur");
		s1.setSmbNo(9786543);
		
		return s1;
	}
}
