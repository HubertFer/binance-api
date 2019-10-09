package com.binanceapi.model;

public class Order {

	private String symbol;
	private Integer orderId;
	private Integer orderListId;
	private String clientOrderId;
	private String price;
	private String origQty;
	private String executedQty;
	private String cummulativeQuoteQty;
	private String status;
	private String timeInForce;
	private String type;
	private String side;
	private String stopPrice;
	private String icebergQty;
	private Integer time;
	private Integer updateTime;
	private Boolean isWorking;
	
	
	private User user;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(Integer orderListId) {
		this.orderListId = orderListId;
	}

	public String getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOrigQty() {
		return origQty;
	}

	public void setOrigQty(String origQty) {
		this.origQty = origQty;
	}

	public String getExecutedQty() {
		return executedQty;
	}

	public void setExecutedQty(String executedQty) {
		this.executedQty = executedQty;
	}

	public String getCummulativeQuoteQty() {
		return cummulativeQuoteQty;
	}

	public void setCummulativeQuoteQty(String cummulativeQuoteQty) {
		this.cummulativeQuoteQty = cummulativeQuoteQty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(String stopPrice) {
		this.stopPrice = stopPrice;
	}

	public String getIcebergQty() {
		return icebergQty;
	}

	public void setIcebergQty(String icebergQty) {
		this.icebergQty = icebergQty;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getIsWorking() {
		return isWorking;
	}

	public void setIsWorking(Boolean isWorking) {
		this.isWorking = isWorking;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
