package com.accenture.app.newspage.entity;

import java.math.BigDecimal;

public class Discount {
	// Meta data for the custom discount field
	private Field field;
	
	// Calculated value of the discount
	private BigDecimal value;

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
