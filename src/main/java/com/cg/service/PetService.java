package com.cg.service;

import java.util.List;

import com.cg.dto.PetRequestDTO;
import com.cg.dto.PetResponseDTO;
import com.cg.dto.SuccessDto;

public interface PetService 
{
	public SuccessDto addPet(PetRequestDTO dto);
	
	public List<PetResponseDTO> getAllPets();
	
	public List<PetResponseDTO> getPetsByCategory(Integer categoryId);
	
	public PetResponseDTO getPetById(Integer petId);
	
	public List<PetResponseDTO> getPetsByAge(Integer age);
	
	public List<PetResponseDTO> getPetsByPriceRange(Double minPrice, Double maxPrice);
	
	public List<PetResponseDTO> searchPetsByName(String name);
	
	public List<PetResponseDTO> searchPetsByBreed(String breed);
	
	public SuccessDto updatePet(Integer petId, PetRequestDTO dto);

	public SuccessDto deletePet(Integer petId);
}
