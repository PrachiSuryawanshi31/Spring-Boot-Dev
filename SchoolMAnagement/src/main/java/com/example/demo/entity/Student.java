package com.example.demo.entity;

public class Student {
	
	String sName;
	String sAddress;
	String sSchoolName;
	int sRollNo;
	char sDiv;
	
	
	public String getsName()
	{
		return sName;
	}
	
	public void setsName(String sName)
	{
		this.sName=sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsSchoolName() {
		return sSchoolName;
	}

	public void setsSchoolName(String sSchoolName) {
		this.sSchoolName = sSchoolName;
	}

	public int getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	public char getsDiv() {
		return sDiv;
	}

	public void setsDiv(char sDiv) {
		this.sDiv = sDiv;
	}
	
	
	

}
