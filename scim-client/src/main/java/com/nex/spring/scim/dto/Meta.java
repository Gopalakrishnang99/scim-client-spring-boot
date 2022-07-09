package com.nex.spring.scim.dto;

import java.net.URI;
import java.time.LocalDateTime;

public class Meta {
	
	private ResourceType resourceType;
	private LocalDateTime created;
	private LocalDateTime lastModified;
	private URI location;
	
	public Meta(ResourceType resourceType, LocalDateTime created, LocalDateTime lastModified, URI location) {
		super();
		this.resourceType = resourceType;
		this.created = created;
		this.lastModified = lastModified;
		this.location = location;
	}

	public Meta() {
		super();
	}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
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

	public URI getLocation() {
		return location;
	}

	public void setLocation(URI location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Meta [resourceType=" + resourceType + ", created=" + created + ", lastModified=" + lastModified
				+ ", location=" + location + "]";
	}	

}
