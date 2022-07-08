package com.nex.spring.scim.dto;

import java.net.URI;

public class Photo {
	
	private URI value;
	private String display;
	private String type;
	Boolean primary;
	
	public Photo(URI value, String display, String type, Boolean primary) {
		super();
		this.value = value;
		this.display = display;
		this.type = type;
		this.primary = primary;
	}
	
	public Photo() {
		super();
	}

	public URI getValue() {
		return value;
	}

	public void setValue(URI value) {
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
		return "Photo [value=" + value + ", display=" + display + ", type=" + type + ", primary=" + primary + "]";
	}
	
}
