package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Addresses;

public interface AddressesRepository extends JpaRepository<Addresses, Integer> {

}
