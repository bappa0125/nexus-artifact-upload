package com.accenture.app.newspage.services;


import com.accenture.app.newspage.entity.OrderLineDTO;
import com.accenture.app.newspage.entity.Price;

public interface INetPriceCalculatorService {
	public Price calculatePrice(OrderLineDTO orderLineDTO);
}
