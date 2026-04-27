package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
