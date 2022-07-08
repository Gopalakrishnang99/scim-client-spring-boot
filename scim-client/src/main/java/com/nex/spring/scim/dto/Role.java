package com.nex.spring.scim.dto;

public class Role {
	
	private String value;
	private String display;
	private String type;
	private Boolean primary;
	
	public Role(String value, String display, String type, Boolean primary) {
		super();
		this.value = value;
		this.display = display;
		this.type = type;
		this.primary = primary;
	}

	public Role() {
		super();
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

	public Boolean isPrimary() {
		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	@Override
	public String toString() {
		return "Role [value=" + value + ", display=" + display + ", type=" + type + ", primary=" + primary + "]";
	}
	
}
