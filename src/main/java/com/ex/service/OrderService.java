package com.ex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ex.beans.Order;
import com.ex.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepo;
	
	public Order saveOrder(Order order){
        
		return orderRepo.save(order);
    }
	
	public Order getOrder(Order order){
        
		return orderRepo.save(order);
    }
	
	
	public Optional<Order> getAllOrdersByPriceLessThan (double price){
		return orderRepo.getAllOrdersByPriceLessThan(price);
	}
	

	
	
}
