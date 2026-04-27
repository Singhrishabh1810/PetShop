package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
