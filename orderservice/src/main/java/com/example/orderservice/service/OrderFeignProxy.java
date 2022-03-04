package com.example.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="customer_service", url="http://localhost:8081/")
public interface OrderFeignProxy {

}
