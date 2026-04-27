package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>
{

}
