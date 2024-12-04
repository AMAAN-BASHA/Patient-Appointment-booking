package com.example.patient_appointment_booking.service;


import com.example.patient_appointment_booking.dto.PatientDto;
import com.example.patient_appointment_booking.dto.SavePatientDto;

import java.util.List;

public interface PatientService{

    List<PatientDto> getAllPatients();

    PatientDto getPatientById(Long id);

    PatientDto getPatientByUsername(String username);

    String getPatientFirstnameByUsername(String username);

    PatientDto addPatient(SavePatientDto savePatientDto);

    PatientDto updatePatient(Long id, SavePatientDto savePatientDto);

    void deletePatientById(Long id);
}
