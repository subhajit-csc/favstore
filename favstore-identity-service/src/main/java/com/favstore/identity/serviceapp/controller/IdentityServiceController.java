package com.favstore.identity.serviceapp.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.favstore.identity.serviceapp.exception.ResourceNotFoundException;
import com.favstore.identity.serviceapp.model.UserDetails;
import com.favstore.identity.serviceapp.service.UserService;

@RestController
@RequestMapping("/v1/api")
public class IdentityServiceController {

	@Autowired
	private UserService userService;
	

	/**
	 * Get User Details
	 * @param userId
	 * @return UserDetails
	 * @throws ResourceNotFoundException
	 */
	@GetMapping("/userDetails")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ResponseEntity<UserDetails> getUserDetails(@RequestParam("userId") String userId)
			throws ResourceNotFoundException {

		try {
			UserDetails userDetails = userService.getUserDetails(userId);
			return ResponseEntity.ok().body(userDetails);
		} catch (ResourceNotFoundException e) {
			throw e;
		}
	}


}
