

package com.example.demo;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@PostMapping("addCustomer")
	String addCustomer(@RequestBody Customer c) {

		if(c.getAge()<18)
		{
			return c.getName() + "Your are not eligible";
		}
		return c.getName() + "Your account is opened";
		
	}

}

class Customer {

	private String name;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}


