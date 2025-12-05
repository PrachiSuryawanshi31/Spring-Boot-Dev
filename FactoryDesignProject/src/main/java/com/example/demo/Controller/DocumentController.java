package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelDocumentServiceImpl;
import com.example.demo.Service.PDFDocumentServiceImpl;

@RestController
@RequestMapping("print")
@Qualifier("ExcelDocumentServiceImpl")
public class  DocumentController {

	private PDFDocumentServiceImpl pdfDocumentServiceImpl;
	private ExcelDocumentServiceImpl excelDocumentServiceImpl;
	private ApplicationContext setApplicationContext;


	//Constructor Injection
	
	
	 /* Constructor is special type of method without return type
	 * class name and method is exactly Same in constructor
	 * use constructor to create the object  & to initialize the variable*/


	
	 DocumentController(PDFDocumentServiceImpl pdfDocumentServiceImpl,
			 ExcelDocumentServiceImpl excelDocumentServiceImpl)
	 {
		 this.pdfDocumentServiceImpl =pdfDocumentServiceImpl;
		 this.excelDocumentServiceImpl=excelDocumentServiceImpl;
	 }
	
	 
	 
	 /*Setter injection --->Application Context
	 
	 @Autowired
	 void setApplicationContext(ApplicationContext applicationContext)
	 {
		 this.setApplicationContext=applicationContext ;
	 }*/
	
	 @Autowired
	 ApplicationContext applicationContext; //String Factory
	 
	 @Autowired
	 DocumentService documentService;
	 
	 
	@GetMapping("/{type}")
	public String printTnvoice(@PathVariable String type)
	{
		if(type.equals("pdf"))
		{
		  documentService =(DocumentService) applicationContext.getBean(PDFDocumentServiceImpl.class);
		}
		
		if(type.equals("excel"))
		{
		documentService= (DocumentService) applicationContext.getBean(ExcelDocumentServiceImpl.class);
		}
		
		return documentService.collectData();
		
	}
}

