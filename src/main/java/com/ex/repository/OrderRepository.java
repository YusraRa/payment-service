package com.ex.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.beans.Order;

@Repository

public interface OrderRepository  extends JpaRepository<Order, Integer>{

	Optional<Order> getAllOrdersByPriceLessThan (double price);
}
