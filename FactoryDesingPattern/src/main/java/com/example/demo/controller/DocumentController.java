package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.PdfDocumentServiceImpl;
import com.example.demo.service.WordDocumentServiceImpl;

@RestController
public class DocumentController {
//
////	@Qualifier("WordDocumentServiceImpl")
////	
////	
	@Autowired
	ApplicationContext applicationContext;

	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type) {

		DocumentService documentService = (DocumentService) applicationContext.getBean(type);

		// DocumentService documentService = new PdfDocumentServiceImpl();

		return documentService.collectData();

	}

}
