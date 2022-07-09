package com.nex.spring.scim.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping
	public UserResource createUser(@RequestBody UserResource user) {
		System.out.println(user);
		userService.createUser(user);
		return user;
	}
	
	@GetMapping("/{id}")
	public UserDetails getUserById(@PathVariable Long id) {
		return userService.getUserDetailsById(id);
	}
	

}
