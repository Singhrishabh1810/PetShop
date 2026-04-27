package com.cg.service;

import com.cg.dto.GroomingServicesRequestDTO;
import com.cg.dto.GroomingServicesResponseDTO;
import java.util.*;

public interface GroomingServicesService {
	GroomingServicesResponseDTO createService(GroomingServicesRequestDTO requestDTO);

    GroomingServicesResponseDTO getServiceById(int serviceId);

    List<GroomingServicesResponseDTO> getAllServices();

    List<GroomingServicesResponseDTO> getAvailableServices();

    GroomingServicesResponseDTO updateService(int serviceId, GroomingServicesRequestDTO requestDTO);

    GroomingServicesResponseDTO toggleAvailability(int serviceId);

    void deleteService(int serviceId);

}
