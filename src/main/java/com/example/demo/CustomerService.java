package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	private final CustomerDao custDao;
	
	@Autowired
	public CustomerService(CustomerDao custDao) {
		this.custDao = custDao;
	}
	
	public int addCustomer(Customers customer) {
		return custDao.addCustomer(customer);
	}
	
	public List<Customers> selectAllCustomers(){
		return custDao.allCustomers();
	}
	
	public Optional<Customers>selectById(UUID id){
		return custDao.selectById(id);
	}
	
	public int deleteById(UUID id) {
		return custDao.deleteById(id);
	}
	
	public int updateById(UUID id,Customers customer) {
		return custDao.updateById(id, customer);
	}
	

}
