package com.favstore.identity.serviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.favstore.identity.serviceapp.entity.UserAddress;



@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

	UserAddress findByuser_userId(String userId);
	
}