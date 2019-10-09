package com.binanceapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ConnectionController {

	@GetMapping
	public static String getConnection() {
		
		final String url = "https://api.binance.com/";
		
		RestTemplate restTemplate = new RestTemplate();
		String connection = restTemplate.getForObject(url, String.class);
		return connection;
	}
	
}
