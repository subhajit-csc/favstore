package com.favstore.catalog.serviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.favstore.catalog.serviceapp.entity.CategoryType;



@Repository
public interface CategoryTypeRepository extends JpaRepository<CategoryType, Long>{

	
	
	
}