package com.ex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.beans.Payment;


@Repository

public interface PaymentRepository  extends JpaRepository<Payment, Integer>{

	
	List<Payment> findPaymentById(int id);

	List<Payment> getAllPaymentsByPaymentMethod (String method);

	
}
