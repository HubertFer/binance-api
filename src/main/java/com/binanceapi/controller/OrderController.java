package com.binanceapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.binanceapi.model.Order;

@RestController
@RequestMapping(value="/v3/order", method=RequestMethod.GET)
public class OrderController {

	
	public ResponseEntity<Order> getOrderStatus(){

	}
}
