package com.sbs.wanacry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

import com.sbs.wanacry.model.Customer;
import com.sbs.wanacry.repository.CustomerRepository;

@RestController
@RequestMapping("/service")
public class HomeController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping(value="/all")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	@PutMapping(value="/create")
	public Customer createCustomer(@Valid @RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

}
