package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        return new PatientResponseDTO(
                patient.getId(),
                patient.getName(),
                patient.getEmail(),
                patient.getAddress(),
                patient.getDateOfBirth().toString()
        );
    }

    public static Patient toEntity(PatientRequestDTO requestDTO)
    {
        Patient patient = new Patient();
        patient.setName(requestDTO.name());
        patient.setEmail(requestDTO.email());
        patient.setAddress(requestDTO.address());
        patient.setDateOfBirth(LocalDate.parse(requestDTO.dateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(requestDTO.registeredDate()));
        return  patient;
    }

}
