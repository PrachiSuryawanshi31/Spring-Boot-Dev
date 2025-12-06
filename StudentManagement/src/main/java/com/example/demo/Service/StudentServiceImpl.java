package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		if(student.getAge()<18)
		{
			return "Not Eligible";
		}
		
		return "You are Eligible";
	}
	

}
