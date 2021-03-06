package com.nex.spring.scim.model;

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
@Table(name="user_phone_numbers")
public class PhoneNumber {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_phone_number_seq-gen")
	@SequenceGenerator(name="user_phone_number_seq-gen",sequenceName="user_phone_number_seq",allocationSize=1)
	@Column(name="email_id")
	private Long phoneNumberId;
	
	@Column(name="value")
	private String value;
	
	@Column(name="display")
	private String display;
	
	@Column(name="type")
	private String type;
	
	@Column(name="is_primary")
	private Boolean primary;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",referencedColumnName="user_id",insertable=false,updatable=false)
	private UserDetails userDetails;

	public PhoneNumber(Long phoneNumberId, String value, String display, String type, Boolean primary,
			UserDetails userDetails) {
		super();
		this.phoneNumberId = phoneNumberId;
		this.value = value;
		this.display = display;
		this.type = type;
		this.primary = primary;
		this.userDetails = userDetails;
	}

	public PhoneNumber() {
		super();
	}

	public Long getPhoneNumberId() {
		return phoneNumberId;
	}

	public void setPhoneNumberId(Long phoneNumberId) {
		this.phoneNumberId = phoneNumberId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getPrimary() {
		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phoneNumberId=" + phoneNumberId + ", value=" + value + ", display=" + display + ", type="
				+ type + ", primary=" + primary + ", userDetails=" + userDetails + "]";
	}
}
