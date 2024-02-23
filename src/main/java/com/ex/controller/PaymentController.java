package com.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.service.PaymentService;
import com.ex.service.exceptions.PaymentNotFoundException;
import com.ex.beans.Payment;
import com.ex.controller.response.ErrorResponse;

@RestController // Controller + ResponseBody
@RequestMapping(value = "/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping(value= "/payments/{method}")
	public List<Payment> getAllPaymentsByPaymentMethod (@PathVariable String method)
	{
		return paymentService.getAllPaymentsByPaymentMethod(method);
	}
	
	
	
	
	@GetMapping(value= "/cancel")
	public ResponseEntity<?> cancelPay(@RequestBody Payment payment)
	{
		try {
			paymentService.cancelPay(payment);
			return new ResponseEntity<>("Payment successfully canceled", HttpStatus.OK);
		}catch(PaymentNotFoundException e) {
			return new ResponseEntity<>(new ErrorResponse(e.getMessage()), HttpStatus.NOT_FOUND);

		}
		
	}
}
