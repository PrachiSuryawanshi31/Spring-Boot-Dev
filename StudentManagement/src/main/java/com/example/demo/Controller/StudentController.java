package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.Student;



@RestController 
@RequestMapping("add")
public class StudentController {

	@Autowired
	StudentService service; 
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student )
	{
		service.saveStudent(student);
		
		return "Student in the DataBase";
	}

}
