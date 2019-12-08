package com.favstore.catalog.serviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.favstore.catalog.serviceapp.entity.ProductCategory;



@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

	
	
}