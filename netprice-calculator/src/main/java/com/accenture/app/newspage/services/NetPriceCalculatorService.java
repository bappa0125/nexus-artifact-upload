package com.accenture.app.newspage.services;


import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.accenture.app.newspage.entity.OrderLineDTO;
import com.accenture.app.newspage.entity.Price;

@Service
public class NetPriceCalculatorService implements INetPriceCalculatorService {
	public Price calculatePrice(OrderLineDTO orderLineDTO)
	{
		// Without composite
		Price calculatedPrice = new Price();
		BigDecimal q = new BigDecimal(orderLineDTO.getQuantity());
		BigDecimal netPrice = q.multiply(orderLineDTO.getUnitPrice());
		calculatedPrice.setNetPrice(netPrice);
		return calculatedPrice;
	}
}
