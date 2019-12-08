package com.favstore.order.serviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.favstore.order.serviceapp.entity.SalesOrder;



@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long>{

	SalesOrder findByorderNumber(String orderNumber);
	
}