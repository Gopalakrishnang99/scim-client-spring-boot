package com.nex.spring.scim.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Name {
	
	private String givenName;
	private String familyName;
	private String formatted;
	
	public Name(String givenName, String familyName, String formatted) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.formatted = formatted;
	}

	public Name() {
		super();
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFormatted() {
		return formatted;
	}

	public void setFormatted(String formatted) {
		this.formatted = formatted;
	}

	@Override
	public String toString() {
		return "Name [givenName=" + givenName + ", familyName=" + familyName + ", formatted=" + formatted + "]";
	}
	
	
}
