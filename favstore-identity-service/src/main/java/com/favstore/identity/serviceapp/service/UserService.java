package com.favstore.identity.serviceapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.favstore.identity.serviceapp.entity.UserAddress;
import com.favstore.identity.serviceapp.exception.ResourceNotFoundException;
import com.favstore.identity.serviceapp.model.UserAddressDetails;
import com.favstore.identity.serviceapp.model.UserDetails;
import com.favstore.identity.serviceapp.repository.UserAddressRepository;

@Service
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserAddressRepository  userAddressRepository;
		
	public UserDetails getUserDetails(String userId)
			throws ResourceNotFoundException {
		logger.info("getUserDetails invoked");
		UserDetails userDetails=new UserDetails();
		try {			
			
			UserAddress  address=userAddressRepository.findByuser_userId(userId);
			userDetails.setUserId(address.getUser().getUserId());
			userDetails.setName(address.getUser().getName());
			userDetails.setEmail(address.getUser().getEmail());
			userDetails.setPhone(address.getUser().getPhone());
			
			UserAddressDetails userAddress=new UserAddressDetails();
			userAddress.setHouseNo(address.getHouseNo());
			userAddress.setStreet(address.getStreet());
			userAddress.setCity(address.getCity());
			userAddress.setCountry(address.getCountry());
			
			userDetails.setUserAddress(userAddress);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error occur !!",e);
		}
		
		return userDetails;
	}
	
}
