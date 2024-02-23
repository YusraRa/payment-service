package com.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.beans.Payment;
import com.ex.repository.PaymentRepository;
import com.ex.service.exceptions.PaymentNotFoundException;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepo;
	
	public List<Payment> getAllPaymentsByPaymentMethod (String method){
		return paymentRepo.getAllPaymentsByPaymentMethod(method);
	}
	
	public void cancelPay(Payment payment) throws PaymentNotFoundException{
		paymentRepo.delete(payment);
	}
}
