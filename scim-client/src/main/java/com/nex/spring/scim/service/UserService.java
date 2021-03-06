package com.nex.spring.scim.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nex.spring.scim.dto.Address;
import com.nex.spring.scim.dto.UserResource;
import com.nex.spring.scim.model.AddressDetails;
import com.nex.spring.scim.model.UserDetails;
import com.nex.spring.scim.repository.AddressRepository;
import com.nex.spring.scim.repository.EmailRepository;
import com.nex.spring.scim.repository.PhoneNumberRepository;
import com.nex.spring.scim.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	EmailRepository emailRepo;
	
	@Autowired
	PhoneNumberRepository phoneNumbeRepo;
	
	@Transactional
	public UserDetails createUser(UserResource userResource) {
		UserDetails user=new UserDetails();

		user.setUserName(userResource.getUserName());
		user.setDisplayName(userResource.getDisplayName());
		user.setGivenName(userResource.getName().getGivenName());
		user.setFamilyName(userResource.getName().getFamilyName());
		user.setNickName(userResource.getNickName());
		user.setTitle(userResource.getTitle());
		user.setUserType(userResource.getUseType());
		user.setActive(userResource.isActive());
		user.setCreated(LocalDateTime.now());
		user.setLastModified(LocalDateTime.now());
		user.setEmployeeNumber(userResource.getEnterpriseUser().getEmployeeNumber());
		user.setCostCenter(userResource.getEnterpriseUser().getCostCenter());
		user.setOrganization(userResource.getEnterpriseUser().getOrganization());
		user.setDivision(userResource.getEnterpriseUser().getDivision());
		user.setDepartment(userResource.getEnterpriseUser().getDepartment());
		user.setManagerId(Long.valueOf(userResource.getEnterpriseUser().getManager().getValue()));
		
		var savedObject=userRepo.save(user);
		
		saveAddresses(userResource.getAddresses(),user);
		return savedObject;
	}
	
	public UserDetails getUserDetailsById(Long id) {
		return userRepo.findUserDetailsByUserId(id);
	}
	
	private void saveAddresses(Address[] addresses,UserDetails userDetails){
		for(Address add:addresses) {
			AddressDetails addDetail=new AddressDetails();
			addDetail.setStreetAddress(add.getStreetAddress());
			addDetail.setLocality(add.getLocality());
			addDetail.setRegion(add.getRegion());
			addDetail.setPostalCode(add.getPostalCode());
			addDetail.setCountry(add.getCountry());
			addDetail.setType(add.getType());
			addDetail.setUserDetails(userDetails);
			addressRepo.save(addDetail);
		}
	}
}
