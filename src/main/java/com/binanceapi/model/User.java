package com.binanceapi.model;

import java.util.List;

public class User {

	private Long userId;
	private String apiKey;
	private String secretKey;
	public User(Long userId, String apiKey, String secretKey) {
		super();
		this.userId = userId;
		this.apiKey = apiKey;
		this.secretKey = secretKey;
	}
	
	public User() {
	}

	private List<Order> orders;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
