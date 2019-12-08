package com.favstore.identity.serviceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.favstore.identity.serviceapp.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	
}