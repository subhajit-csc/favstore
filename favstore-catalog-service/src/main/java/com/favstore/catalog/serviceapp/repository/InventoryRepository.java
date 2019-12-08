package com.favstore.catalog.serviceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.favstore.catalog.serviceapp.entity.Inventory;



@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	List<Inventory> findByProductCategory_Id(Long id);
	
}