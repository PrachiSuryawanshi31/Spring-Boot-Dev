package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;


@RestController
public class DocumentController{
	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		
		
		DocumentService documentService= null;
		
		if(type.equals("Pdf"))
		{
			ds = new PdfDocumentService();
		}
		
		
		ds.readData();
		ds.processData();
		return ds.printData();
	}

	

}
