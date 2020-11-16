package com.example.demo;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;


public interface CustomerDao {
	
	int insertCustomer(UUID id ,Customers customer);
	
	default int addCustomer(Customers customer) {
		UUID id = UUID.randomUUID();
		return insertCustomer(id,customer);
		
	}
	
	List<Customers>allCustomers();
	
	Optional<Customers>selectById(UUID id);
	
	int deleteById(UUID id);
	
	int updateById(UUID id, Customers customer);

}
