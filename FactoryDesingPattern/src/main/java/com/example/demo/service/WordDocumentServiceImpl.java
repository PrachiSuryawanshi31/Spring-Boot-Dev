package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class WordDocumentServiceImpl extends DocumentServiceAb {

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing Data for Word");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Priting Data");
		return "word";
	}

}
