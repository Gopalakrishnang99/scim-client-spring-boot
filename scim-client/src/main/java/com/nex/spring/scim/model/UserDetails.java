package com.nex.spring.scim.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_seq-gen")
	@SequenceGenerator(name="user_seq-gen",sequenceName="user_seq",allocationSize=1)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="display_name")
	private String displayName;
	
	@Column(name="given_name")
	private String givenName;
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="nick_name")
	private String nickName;
	
	@Column(name="title")
	private String title;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="active")
	private Boolean active;
	
	@Column(name="created")
	private LocalDateTime created;
	
	@Column(name="last_modified")
	private LocalDateTime lastModified;
	
	@OneToMany(mappedBy="userDetails")
	private Set<AddressDetails> address;
	
	@OneToMany(mappedBy="userDetails")
	private Set<Email> emails;
	
	@OneToMany(mappedBy="userDetails")
	private Set<PhoneNumber> phoneNumbers;
	
	@Column(name="employee_number")
	private String employeeNumber;
	
	@Column(name="cost_center")
	private String costCenter;
	
	@Column(name="organization")
	private String organization;
	
	@Column(name="division")
	private String division;
	
	@Column(name="departement")
	private String department;
	
	@Column(name="manager_id")
	private Long managerId;

	public UserDetails(Long userId, String userName, String displayName, String givenName, String familyName,
			String nickName, String title, String userType, Boolean active, LocalDateTime created,
			LocalDateTime lastModified, Set<AddressDetails> address, Set<Email> emails, Set<PhoneNumber> phoneNumbers,
			String employeeNumber, String costCenter, String organization, String division, String department,
			Long managerId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.displayName = displayName;
		this.givenName = givenName;
		this.familyName = familyName;
		this.nickName = nickName;
		this.title = title;
		this.userType = userType;
		this.active = active;
		this.created = created;
		this.lastModified = lastModified;
		this.address = address;
		this.emails = emails;
		this.phoneNumbers = phoneNumbers;
		this.employeeNumber = employeeNumber;
		this.costCenter = costCenter;
		this.organization = organization;
		this.division = division;
		this.department = department;
		this.managerId = managerId;
	}

	public UserDetails() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getLastModified() {
		return lastModified;
	}

	public void setLastModified(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}

	public Set<AddressDetails> getAddress() {
		return address;
	}

	public void setAddress(Set<AddressDetails> address) {
		this.address = address;
	}

	public Set<Email> getEmails() {
		return emails;
	}

	public void setEmails(Set<Email> emails) {
		this.emails = emails;
	}

	public Set<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", displayName=" + displayName
				+ ", givenName=" + givenName + ", familyName=" + familyName + ", nickName=" + nickName + ", title="
				+ title + ", userType=" + userType + ", active=" + active + ", created=" + created + ", lastModified="
				+ lastModified + ", address=" + address + ", emails=" + emails + ", phoneNumbers=" + phoneNumbers
				+ ", employeeNumber=" + employeeNumber + ", costCenter=" + costCenter + ", organization=" + organization
				+ ", division=" + division + ", department=" + department + ", managerId=" + managerId + "]";
	}

}

    
