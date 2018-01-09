package com.example.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	CustomerRepository repo;
	
	@RequestMapping("/getbyfirstname")
	public List<Customer> getdata(){
		List<Customer> name = repo.findByFirstname("Kakarla");
		return name;
	}
	
	@RequestMapping("/getbyage")
	public List<Customer> getall(){
		List<Customer> Age = repo.findCustomerHasAgeGreaterThan(15);;
		return Age;
	}
	
}
