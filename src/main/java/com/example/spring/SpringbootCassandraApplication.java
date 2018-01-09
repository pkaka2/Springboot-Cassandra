package com.example.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.Customer;


@SpringBootApplication
public class SpringbootCassandraApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

		public static void main(String[] args) {
			SpringApplication.run(SpringbootCassandraApplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			clearData();
			saveData();
		}
		
		public void clearData(){
			customerRepository.deleteAll();
		}
		
		public void saveData(){
			System.out.println("===================Saved Customers to Cassandra===================");
			Customer cust_1 = new Customer(1, "Kakarla", "pradeep", 24);
	        Customer cust_2 = new Customer(2, "Kakarla", "Nikhil", 18);
	        Customer cust_3 = new Customer(3, "Sada", "srinu", 45);
	 
	        customerRepository.save(cust_1);
	        customerRepository.save(cust_2);
	        customerRepository.save(cust_3);
		}
		
}
