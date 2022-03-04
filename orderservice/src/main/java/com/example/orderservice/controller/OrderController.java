package com.example.orderservice.controller;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.service.OrderService;



@RestController

public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping("/all")
	public List<Order> showAll(){
		return service.displayAll();
	}
	
}
