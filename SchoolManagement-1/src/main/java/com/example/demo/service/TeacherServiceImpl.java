package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepo;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepo teacherrepo;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub

		return teacherrepo.save(teacher);
		

	}
}
