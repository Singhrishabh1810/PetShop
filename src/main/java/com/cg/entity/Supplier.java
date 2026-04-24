package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Supplier 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private Integer supplierId;
	
	private String name;
	@Column(name = "contact_person")
	private String contactPerson;
	
	@Column(name = "phone_number")
	private String phoneNumber;

	private String email;
	
	//@ManyToOne
//    @JoinColumn(name = "address_id")
//    private Address address;
}
