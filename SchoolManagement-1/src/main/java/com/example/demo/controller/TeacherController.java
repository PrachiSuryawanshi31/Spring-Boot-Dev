package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherServiceImpl;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherServiceImpl teacherimpl;
	
	 @PostMapping("addTeacher")
	 Teacher addTeacher(@RequestBody Teacher teacher)
	{
		return teacherimpl.saveTeacher(teacher) ;
		
	}
}
