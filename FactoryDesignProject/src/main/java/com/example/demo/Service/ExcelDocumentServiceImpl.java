package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ExcelDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for Excel");
	
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print data in Excel");
		return "EXcel";
	}

}
