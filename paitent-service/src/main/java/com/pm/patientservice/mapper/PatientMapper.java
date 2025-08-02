package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        return new PatientResponseDTO(
                patient.getId(),
                patient.getName(),
                patient.getEmail(),
                patient.getAddress(),
                patient.getDateOfBirth()
        );
    }

    public static Patient toEntity(PatientResponseDTO responseDTO)
    {
        Patient patient = new Patient();
        patient.setId(responseDTO.id());
        patient.setName(responseDTO.name());
        patient.setEmail(responseDTO.email());
        patient.setAddress(responseDTO.address());
        patient.setDateOfBirth(responseDTO.dateOfBirth());
        return  patient;
    }

}
