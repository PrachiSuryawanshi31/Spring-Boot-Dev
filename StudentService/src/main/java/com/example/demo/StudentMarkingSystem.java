package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentMarkingSystem {
	
	@PostMapping("StudentResult")
	String StudentResult(@RequestBody Student S)
	{
		if(S.getPersentage()>35)
		{
			return"You are Pass !";
		}
		
		return "You are fail !";
	}

}


class Student
{
	private String name;
	private int rollno;
	private int persentage;
	
	public String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	public int getRollNo()
	{
		return rollno ;
	}
	
	void setRollNo(int rollno)
	{
		this.rollno=rollno; 
	}
	
	public int  getPersentage()
	{
		return persentage;
	}
	
	void  setPersentage( int persentage)
	{
		this.persentage=persentage;
	}
	
	
}
