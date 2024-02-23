package com.ex.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.beans.Order;
import com.ex.service.OrderService;

@RestController // Controller + ResponseBody
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping(value= "/orders/{price}")
	public Optional<Order> getAllOrdersByPriceLessThan (double price){
		return orderService.getAllOrdersByPriceLessThan(price);
	}
	
	

	
}
