package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ExcelDocumentServiceImpl extends DocumentServiceAB{
	
	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For excel");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print Data For Excel");
		return "Excel";
	}

}
