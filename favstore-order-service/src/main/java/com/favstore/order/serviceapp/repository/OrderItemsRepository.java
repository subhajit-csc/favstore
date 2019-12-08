package com.favstore.order.serviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.favstore.order.serviceapp.entity.OrderItem;



@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItem, Long>{

	
	
}