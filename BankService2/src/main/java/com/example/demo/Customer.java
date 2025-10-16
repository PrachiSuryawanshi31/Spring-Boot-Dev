package com.example.demo;

public class Customer {
	
	private String UserName;
	private int age;
	private String bankName;
	private String location;
	
	
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String getBankName()
	{
		return bankName;
	}
	
	public void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	
	String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}

}
