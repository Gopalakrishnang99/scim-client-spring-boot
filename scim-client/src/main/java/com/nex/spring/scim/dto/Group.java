package com.nex.spring.scim.dto;

import java.net.URI;

public class Group {
	
	private String value;
	private URI $ref;
	private String display;
	private String type;
	
	public Group(String value, URI $ref, String display, String type) {
		super();
		this.value = value;
		this.$ref = $ref;
		this.display = display;
		this.type = type;
	}

	public Group() {
		super();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public URI get$ref() {
		return $ref;
	}

	public void set$ref(URI $ref) {
		this.$ref = $ref;
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

	@Override
	public String toString() {
		return "Group [value=" + value + ", $ref=" + $ref + ", display=" + display + ", type=" + type + "]";
	}
	
}
