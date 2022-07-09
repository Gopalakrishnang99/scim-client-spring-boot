package com.nex.spring.scim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex.spring.scim.model.PhoneNumber;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber,Long> {

}
