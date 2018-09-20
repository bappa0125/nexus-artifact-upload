package com.accenture.app.newspage.entity;

import java.math.BigDecimal;
import java.util.List;

public class Price {

	private BigDecimal netPrice;
	private List<Discount> discounts;

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}

	public List<Discount> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

}
