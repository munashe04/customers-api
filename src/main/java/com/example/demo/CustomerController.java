package com.example.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

@RequestMapping("/api/v1/person")
@Component
@RestController
public class CustomerController {
	
	private final CustomerService custService;
	
	@Autowired
	public CustomerController(CustomerService custService) {
		this.custService = custService;
	}
	
	@PostMapping
	public void addCustomer(@Validated @NotNull @RequestBody Customers customer) {
		custService.addCustomer(customer);
	}
	
	@GetMapping
	public List<Customers>allCustomers(){
		return custService.selectAllCustomers();
	}
	
	@GetMapping(path = "{id}")
	public Customers getPersonById(@PathVariable("id")UUID id) {
		return custService.selectById(id).orElse(null);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteById(@PathVariable() UUID id) {
		custService.deleteById(id);
	}
	
	@PutMapping(path = "{id}")
	public void updateCustomer(@PathVariable("id") UUID id, @RequestBody Customers customer){
		custService.updateById(id, customer);
	}

}
