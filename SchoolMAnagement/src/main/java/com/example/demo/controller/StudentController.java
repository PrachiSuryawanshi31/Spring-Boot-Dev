package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@PostMapping("addStudent")
	String addStudent(@RequestBody Student student)
	{
		StudentService SS =new StudentService();
		
		return SS.saveStudent(student);
	}
	
	@GetMapping("getStudent")
	Student getStudent()
	{
		Student s1= new Student();
		s1.setsName("Prachi");
		s1.setsAddress("Latur");
		s1.setsSchoolName("KVL");
		s1.setsRollNo(90);
		s1.setsDiv('c');
		
		return s1;
		
	}
}