package com.nex.spring.scim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex.spring.scim.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
