package com.favstore.order.serviceapp.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.favstore.order.serviceapp.exception.ResourceNotFoundException;
import com.favstore.order.serviceapp.model.OrderDetails;
import com.favstore.order.serviceapp.service.OrderService;

@RestController
@RequestMapping("/v1/api")
public class OrderServiceController {

	@Autowired
	private OrderService orderService;
	

	/**
	 * Get Order Details
	 * @param orderNumber
	 * @return OrderDetails
	 * @throws ResourceNotFoundException
	 */
	@GetMapping("/orderDetails")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ResponseEntity<OrderDetails> getUserDetails(@RequestParam("orderNumber") String orderNumber)
			throws ResourceNotFoundException {

		try {
			OrderDetails orderDetails = orderService.getSalesOrder(orderNumber);
			return ResponseEntity.ok().body(orderDetails);
		} catch (ResourceNotFoundException e) {
			throw e;
		}
	}
	


}
