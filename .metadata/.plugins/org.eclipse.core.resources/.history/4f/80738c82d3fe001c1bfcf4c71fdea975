package com.nex.spring.scim.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nex.spring.scim.dto.UserResource;

@RestController
@RequestMapping("/Users")
public class UserController {
	
	@PostMapping
	public UserResource createUser(@RequestBody UserResource user) {
		System.out.println(user);
		return user;
	}
	

}
