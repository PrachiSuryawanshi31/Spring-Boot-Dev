package com.example.demo.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PDFDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for PDF");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print data in PDF");
		return "PDF";
	}
	

}
