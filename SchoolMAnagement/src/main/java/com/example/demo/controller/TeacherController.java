package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;


@RestController
public class TeacherController {
	
	@PostMapping("addTeacher")
	String addTeacher(@RequestBody Teacher teacher)
	{
		
		TeacherService TS= new TeacherService();
		return TS.saveTeacher(teacher);
	}
	
	

	@GetMapping("getTeacher")
	Teacher getTeacher()
	{
		Teacher T1 =new Teacher();
		T1.settName("SSS");
		T1.settClgName("Cocsit");
		T1.settId(23434);
		
		
		return T1;
	}

}
