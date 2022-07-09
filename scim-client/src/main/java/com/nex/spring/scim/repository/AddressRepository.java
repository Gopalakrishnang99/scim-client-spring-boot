package com.nex.spring.scim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex.spring.scim.model.AddressDetails;

public interface AddressRepository extends JpaRepository<AddressDetails, Long> {

}
