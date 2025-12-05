package com.example.demo.Service;

public abstract class DocumentServiceAB implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("read Data From Database");
	}

	@Override
	public String collectData() {
		// TODO Auto-generated method stub
		readData();
		processData();
		return printData();
	}
}
