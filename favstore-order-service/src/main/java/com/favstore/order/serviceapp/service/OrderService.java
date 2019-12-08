package com.favstore.order.serviceapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.favstore.order.serviceapp.entity.SalesOrder;
import com.favstore.order.serviceapp.exception.ResourceNotFoundException;
import com.favstore.order.serviceapp.model.OrderDetails;
import com.favstore.order.serviceapp.repository.SalesOrderRepository;

@Service
public class OrderService {

	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

	@Autowired
	private SalesOrderRepository  salesOrderRepository;

	
	public OrderDetails getSalesOrder(String orderNumber)
			throws ResourceNotFoundException {
		logger.info("getProductCatalog invoked");
		OrderDetails orderDetails=new OrderDetails();
		try {			
			SalesOrder salesOrder=salesOrderRepository.findByorderNumber(orderNumber);
			orderDetails.setOrderNumber(salesOrder.getOrderNumber());
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error occur !!",e);
		}
		
		return orderDetails;
	}
	
}
