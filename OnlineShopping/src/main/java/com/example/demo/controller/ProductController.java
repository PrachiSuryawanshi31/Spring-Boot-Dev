package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	@PostMapping("addProduct")
	String addProduct(@RequestBody Product product)
	{
		ProductService ps= new ProductService();
		
		return ps.saveProduct(product);
	}
	
	
	@GetMapping("addProduct")
	Product getProduct()
	{
		Product p1 =new Product();
		
		p1.setpName("Moible");
		p1.setpId("23456pgdfd43");
		p1.setpLable("Mobile Phone");
		
		return p1;
	}
	

}