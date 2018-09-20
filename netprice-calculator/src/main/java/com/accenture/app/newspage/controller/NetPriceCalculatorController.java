package com.accenture.app.newspage.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.app.newspage.entity.Message;
import com.accenture.app.newspage.entity.OrderLineDTO;
import com.accenture.app.newspage.entity.Price;
import com.accenture.app.newspage.services.INetPriceCalculatorService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class NetPriceCalculatorController {

	@Autowired
	protected INetPriceCalculatorService netPriceCalculatorService;

	@RequestMapping(value = "/netprice/calculate", method = RequestMethod.POST)
	public @ResponseBody Price calculate(@RequestBody OrderLineDTO orderLineDTO) {
		Price price = netPriceCalculatorService.calculatePrice(orderLineDTO);

		return price;
		
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Message getMessage() {
		Message message = new Message();
		message.setMessage("Core Net Price Calculator API");
		return message;

	}

}
