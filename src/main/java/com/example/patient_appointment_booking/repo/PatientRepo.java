package com.example.patient_appointment_booking.repo;

import com.example.patient_appointment_booking.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
    Optional<Patient> findByMobile(String mobile);
}
