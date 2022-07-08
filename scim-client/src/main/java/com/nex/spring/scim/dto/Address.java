package com.nex.spring.scim.dto;

public class Address {
	
	private String formatted;
	private String streetAddress;
	private String locality;
	private String region;
	private String postalCode;
	private String country;
	private String type;
	
	public Address(String formatted, String streetAddress, String locality, String region, String postalCode,
			String country, String type) {
		super();
		this.formatted = formatted;
		this.streetAddress = streetAddress;
		this.locality = locality;
		this.region = region;
		this.postalCode = postalCode;
		this.country = country;
		this.type = type;
	}

	public Address() {
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

	@Override
	public String toString() {
		return "Address [formatted=" + formatted + ", streetAddress=" + streetAddress + ", locality=" + locality
				+ ", region=" + region + ", postalCode=" + postalCode + ", country=" + country + ", type=" + type + "]";
	}
	
}
