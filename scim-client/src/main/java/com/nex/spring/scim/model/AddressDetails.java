package com.nex.spring.scim.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_address")
public class AddressDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_add_seq-gen")
	@SequenceGenerator(name="user_add_seq-gen",sequenceName="user_add_seq",allocationSize=1)
	@Column(name="address_id")
	private Long addressId;
	
	@Column(name="formatted_name")
	private String formatted;
	
	@Column(name="street_address")
	private String streetAddress;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="region")
	private String region;
	
	@Column(name="postal_code")
	private String postalCode;
	
	@Column(name="country")
	private String country;
	
	@Column(name="type")
	private String type;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",referencedColumnName="user_id")
	private UserDetails userDetails;

	public AddressDetails(Long userId, String formatted, String streetAddress, String locality, String region,
			String postalCode, String country, String type, UserDetails userDetails) {
		super();
		this.addressId = userId;
		this.formatted = formatted;
		this.streetAddress = streetAddress;
		this.locality = locality;
		this.region = region;
		this.postalCode = postalCode;
		this.country = country;
		this.type = type;
		this.userDetails = userDetails;
	}

	public AddressDetails() {
		super();
	}

	public String getFormatted() {
		return formatted;
	}

	public void setFormatted(String formatted) {
		this.formatted = formatted;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Long getUserId() {
		return addressId;
	}

	public void setUserId(Long userId) {
		this.addressId = userId;
	}

	@Override
	public String toString() {
		return "Address [userId=" + addressId + ", formatted=" + formatted + ", streetAddress=" + streetAddress
				+ ", locality=" + locality + ", region=" + region + ", postalCode=" + postalCode + ", country="
				+ country + ", type=" + type + ", userDetails=" + userDetails + "]";
	}
	
}
