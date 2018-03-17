package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cucumber")
public class CustomerController {

	@GetMapping(value="/customer")
	public Customer getCustomer() {
		return new Customer("101", "amit", "amit@gmail.com");
	}
}
