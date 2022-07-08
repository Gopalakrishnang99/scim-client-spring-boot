package com.nex.spring.scim.dto;

import java.util.Arrays;

public class X509Certificate {
	
	private byte[] value;
	private String display;
	private String type;
	private Boolean primary;
	
	public X509Certificate(byte[] value, String display, String type, Boolean primary) {
		super();
		this.value = value;
		this.display = display;
		this.type = type;
		this.primary = primary;
	}

	public X509Certificate() {
		super();
	}

	public byte[] getValue() {
		return value;
	}

	public void setValue(byte[] value) {
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

	@Override
	public String toString() {
		return "X509Certificate [value=" + Arrays.toString(value) + ", display=" + display + ", type=" + type
				+ ", primary=" + primary + "]";
	}
	
}
