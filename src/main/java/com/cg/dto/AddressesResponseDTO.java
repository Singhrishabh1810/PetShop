package com.cg.dto;

import java.util.List;

public class AddressesResponseDTO {
	
	private Integer addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    private List<Integer> customerIds;
    private List<Integer> supplierIds;
    private List<Integer> employeeIds;
    
    public AddressesResponseDTO() {
    }
    
	public AddressesResponseDTO(Integer addressId, String street, String city, String state, String zipCode,
			List<Integer> customerIds, List<Integer> supplierIds, List<Integer> employeeIds) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.customerIds = customerIds;
		this.supplierIds = supplierIds;
		this.employeeIds = employeeIds;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<Integer> getCustomerIds() {
		return customerIds;
	}

	public void setCustomerIds(List<Integer> customerIds) {
		this.customerIds = customerIds;
	}

	public List<Integer> getSupplierIds() {
		return supplierIds;
	}

	public void setSupplierIds(List<Integer> supplierIds) {
		this.supplierIds = supplierIds;
	}

	public List<Integer> getEmployeeIds() {
		return employeeIds;
	}

	public void setEmployeeIds(List<Integer> employeeIds) {
		this.employeeIds = employeeIds;
	}
    
    
}
