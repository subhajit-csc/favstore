package com.favstore.catalog.serviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.favstore.catalog.serviceapp.entity.Currency;



@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long>{

	
	
	
}