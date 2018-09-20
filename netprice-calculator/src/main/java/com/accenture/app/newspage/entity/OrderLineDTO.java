package com.accenture.app.newspage.entity;

import java.math.BigDecimal;

public class OrderLineDTO {
	private Long quantity;
	private BigDecimal unitPrice;

	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}	

}
