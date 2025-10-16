package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@PostMapping("AddCustomer")
	String addCustomer(@RequestBody Customer C)
	{
		if(C.getAge()>18)
		{
			return "Account is Opend...!";
		}
		
		return "Account is not Opend";
	}
}
