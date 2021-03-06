package com.nex.spring.scim.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nex.spring.scim.dto.UserResource;
import com.nex.spring.scim.model.UserDetails;
import com.nex.spring.scim.service.UserService;

@RestController
@RequestMapping("/Users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Value("${app.hostname}")
	private String hostname;
	
	private String scimUserBaseURL="scim/v1/Users/";
	
	@PostMapping
	public ResponseEntity<UserResource> createUser(@RequestBody UserResource user) {
		System.out.println(user);
		UserDetails userDetails=userService.createUser(user);
		URI location=URI.create(hostname+scimUserBaseURL+userDetails.getUserId());
		user.setId(userDetails.getUserId());
		user.getMeta().setLocation(location);
		user.getMeta().setCreated(userDetails.getCreated());
		user.getMeta().setLastModified(userDetails.getLastModified());
		return ResponseEntity.accepted()
				.header("Location", location.toString())
				.body(user);
	}
	
	@GetMapping("/{id}")
	public UserDetails getUserById(@PathVariable Long id) {
		return userService.getUserDetailsById(id);
	}
	

}
