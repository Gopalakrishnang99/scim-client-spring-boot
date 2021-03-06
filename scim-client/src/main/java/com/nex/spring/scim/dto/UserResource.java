package com.nex.spring.scim.dto;

import java.net.URI;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserResource {
	
	private String[] schemas;
	private String userName;
	private Name name;
	private String displayName;
	private String nickName;
	private URI profileUrl;
	private String title;
	private String userType;
	private String preferredLanguage;
	private String locale;
	private String timezone;
	private boolean active;
	private String password;
	private Email[] emails;
	private PhoneNumber[] phoneNumbers;
	private IMS[] ims;
	private Photo[] photos;
	private Address[] addresses;
	private Group[] groups;
	private Role[] roles;
	private X509Certificate[] x509certificates;
	private EnterpriseUser enterpriseUser;
	private Meta meta;
	private Long id;
	private String externalId;

	public UserResource(String[] schemas, String userName, Name name, String displayName, String nickName,
			URI profileUrl, String title, String userType, String preferredLanguage, String locale, String timezone,
			boolean active, String password, Email[] emails, PhoneNumber[] phoneNumbers, IMS[] ims, Photo[] photos,
			Address[] addresses, Group[] groups, Role[] roles, X509Certificate[] x509certificates,
			EnterpriseUser enterpriseUser, Meta meta, Long id, String externalId) {
		super();
		this.schemas = schemas;
		this.userName = userName;
		this.name = name;
		this.displayName = displayName;
		this.nickName = nickName;
		this.profileUrl = profileUrl;
		this.title = title;
		this.userType = userType;
		this.preferredLanguage = preferredLanguage;
		this.locale = locale;
		this.timezone = timezone;
		this.active = active;
		this.password = password;
		this.emails = emails;
		this.phoneNumbers = phoneNumbers;
		this.ims = ims;
		this.photos = photos;
		this.addresses = addresses;
		this.groups = groups;
		this.roles = roles;
		this.x509certificates = x509certificates;
		this.enterpriseUser = enterpriseUser;
		this.meta = meta;
		this.id = id;
		this.externalId = externalId;
	}

	public UserResource() {
		super();
	}

	public String[] getSchemas() {
		return schemas;
	}

	public void setSchemas(String[] schemas) {
		this.schemas = schemas;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public URI getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(URI profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUseType() {
		return userType;
	}

	public void setUseType(String useType) {
		this.userType = useType;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Email[] getEmails() {
		return emails;
	}

	public void setEmails(Email[] emails) {
		this.emails = emails;
	}

	public PhoneNumber[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public IMS[] getIms() {
		return ims;
	}

	public void setIms(IMS[] ims) {
		this.ims = ims;
	}

	public Photo[] getPhotos() {
		return photos;
	}

	public void setPhotos(Photo[] photos) {
		this.photos = photos;
	}

	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public Role[] getRoles() {
		return roles;
	}

	public void setRoles(Role[] roles) {
		this.roles = roles;
	}

	public X509Certificate[] getX509certificates() {
		return x509certificates;
	}

	public void setX509certificates(X509Certificate[] x509certificates) {
		this.x509certificates = x509certificates;
	}
	
	@JsonProperty("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
	public EnterpriseUser getEnterpriseUser() {
		return enterpriseUser;
	}

	public void setEnterpriseUser(EnterpriseUser enterpriseUser) {
		this.enterpriseUser = enterpriseUser;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@Override
	public String toString() {
		return "UserResource [schemas=" + Arrays.toString(schemas) + ", userName=" + userName + ", name=" + name
				+ ", displayName=" + displayName + ", nickName=" + nickName + ", profileUrl=" + profileUrl + ", title="
				+ title + ", userType=" + userType + ", preferredLanguage=" + preferredLanguage + ", locale=" + locale
				+ ", timezone=" + timezone + ", active=" + active + ", password=" + password + ", emails="
				+ Arrays.toString(emails) + ", phoneNumbers=" + Arrays.toString(phoneNumbers) + ", ims="
				+ Arrays.toString(ims) + ", photos=" + Arrays.toString(photos) + ", addresses="
				+ Arrays.toString(addresses) + ", groups=" + Arrays.toString(groups) + ", roles="
				+ Arrays.toString(roles) + ", x509certificates=" + Arrays.toString(x509certificates)
				+ ", enterpriseUser=" + enterpriseUser + ", meta=" + meta + ", id=" + id + ", externalId=" + externalId
				+ "]";
	}	

}
