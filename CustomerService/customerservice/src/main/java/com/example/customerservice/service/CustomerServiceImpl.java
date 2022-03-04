package com.example.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.customerservice.model.Customer;

import com.example.customerservice.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	CustomerRepo repo;
	
	@Override
	public List<Customer> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public String insertCustomer(Customer customer) {
		repo.save(customer);
		return "Customer Data Inserted";
	}

	@Override
	public String deleteCustomer(int cid) {
		repo.deleteById(cid);
		return "Customer Data Deleted";
}
}