package com.example.customerservice.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="order-service", url="http://localhost:8082/")
public class CustomerFeignProxy {
 
	
}
