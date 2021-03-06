package com.nex.spring.scim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex.spring.scim.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Long> {
	
	UserDetails findUserDetailsByUserId(Long id);
}
