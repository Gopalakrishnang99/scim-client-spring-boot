package com.nex.spring.scim.dto;

public class EnterpriseUser {
	
	private String employeeNumber;
	private String costCenter;
	private String organization;
	private String division;
	private String department;
	private Manager manager;
	
	public EnterpriseUser(String employeeNumber, String costCenter, String organization, String division,
			String department, Manager manager) {
		super();
		this.employeeNumber = employeeNumber;
		this.costCenter = costCenter;
		this.organization = organization;
		this.division = division;
		this.department = department;
		this.manager = manager;
	}

	public EnterpriseUser() {
		super();
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

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "EnterpriseUser [employeeNumber=" + employeeNumber + ", costCenter=" + costCenter + ", organization="
				+ organization + ", division=" + division + ", department=" + department + ", manager=" + manager + "]";
	}	
	
}
