package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Vaccination;

public interface VaccinationRepository extends JpaRepository<Vaccination,Integer>  {

}
