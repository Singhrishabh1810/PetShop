package com.cg.dto;

import java.util.List;

public class CustomersResponseDTO {
	private Integer customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private AddressesResponseDTO address;
    
    private List<Integer> transactionIds;
    private Long totalTransactions;
    private Long successfulPurchases;
    
    public CustomersResponseDTO() {
	}

	public CustomersResponseDTO(Integer customerId, String firstName, String lastName, String email, String phoneNumber,
			AddressesResponseDTO address, List<Integer> transactionIds, Long totalTransactions,
			Long successfulPurchases) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.transactionIds = transactionIds;
		this.totalTransactions = totalTransactions;
		this.successfulPurchases = successfulPurchases;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public AddressesResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressesResponseDTO address) {
		this.address = address;
	}

	public List<Integer> getTransactionIds() {
		return transactionIds;
	}

	public void setTransactionIds(List<Integer> transactionIds) {
		this.transactionIds = transactionIds;
	}

	public Long getTotalTransactions() {
		return totalTransactions;
	}

	public void setTotalTransactions(Long totalTransactions) {
		this.totalTransactions = totalTransactions;
	}

	public Long getSuccessfulPurchases() {
		return successfulPurchases;
	}

	public void setSuccessfulPurchases(Long successfulPurchases) {
		this.successfulPurchases = successfulPurchases;
	}

	
    
}
