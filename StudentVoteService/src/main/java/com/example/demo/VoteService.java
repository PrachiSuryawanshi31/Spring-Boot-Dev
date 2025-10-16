package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteService {
	
	@PostMapping("VoterId")
	String VoterId(@RequestBody Student S)
	{
		if(S.getAge()>18)
		{
			return S.getName() + "You are Eligible for voter Id";
		}
		return S.getName() +"You are not Eligible for Voter Id" ;
	}

}

class Student
{
	private String name;
	private String address;
	private int age;
	private long mobno;
	
	
	public String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	void setAddress(String address)
	{
		this.address=address;
	}
	
	public int getAge()
	{
		return age;
	}
	
	void setAge(int age)
	{
		this.age=age;
	}
	
	public long getmobno()
	{
		return mobno;
	}
	
	void setMobno(long mobno)
	{
		this.mobno=mobno;
	}
	
	
}


