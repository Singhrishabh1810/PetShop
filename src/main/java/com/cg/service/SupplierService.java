package com.cg.service;

import java.util.List;

import com.cg.dto.PetResponseDTO;
import com.cg.dto.SuccessDto;
import com.cg.dto.SupplierRequestDTO;
import com.cg.dto.SupplierResponseDTO;

public interface SupplierService 
{
	public SuccessDto addSupplier(SupplierRequestDTO dto);
	public SupplierResponseDTO getSupplierById(Integer supplierId);
	public List<SupplierResponseDTO> getAllSuppliers();
	public List<PetResponseDTO> getPetsBySupplier(Integer supplierId);
	public SuccessDto updateSupplier(Integer supplierId, SupplierRequestDTO dto);
	public SuccessDto deleteSupplier(Integer supplierId);
	public SuccessDto assignPetToSupplier(Integer supplierId, Integer petId);
    public SuccessDto removePetFromSupplier(Integer supplierId, Integer petId);

    public List<SupplierResponseDTO> searchSupplierByName(String name);
    public List<SupplierResponseDTO> getSuppliersByCity(String city);
}
