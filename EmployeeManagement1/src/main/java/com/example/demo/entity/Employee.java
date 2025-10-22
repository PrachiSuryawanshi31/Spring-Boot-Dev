package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eId;
	private String eName;
	private String eDpt;
	private long eMobNo;
	private float eSalary;
	
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDpt() {
		return eDpt;
	}

	public void seteDpt(String eDpt) {
		this.eDpt = eDpt;
	}

	public long geteMobNo() {
		return eMobNo;
	}

	public void seteMobNo(long eMobNo) {
		this.eMobNo = eMobNo;
	}

	public float geteSalary() {
		return eSalary;
	}

	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}

	
	
	
	
}
