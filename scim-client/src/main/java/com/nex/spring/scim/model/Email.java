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
@Table(name="user_emails")
public class Email {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_email_seq-gen")
	@SequenceGenerator(name="user_email_seq-gen",sequenceName="user_email_seq",allocationSize=1)
	@Column(name="email_id")
	private Long emailId;
	
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

	public Email(Long emailId, String value, String display, String type, Boolean primary, UserDetails userDetails) {
		super();
		this.emailId = emailId;
		this.value = value;
		this.display = display;
		this.type = type;
		this.primary = primary;
		this.userDetails = userDetails;
	}

	public Email() {
		super();
	}

	public Long getEmailId() {
		return emailId;
	}

	public void setEmailId(Long emailId) {
		this.emailId = emailId;
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
		return "Email [emailId=" + emailId + ", value=" + value + ", display=" + display + ", type=" + type
				+ ", primary=" + primary + ", userDetails=" + userDetails + "]";
	}

}
