package com.example.orderservice.service;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.orderservice.repo.OrderRepo;

public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepo repo;
	
	@Override
	public List<Order> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


}