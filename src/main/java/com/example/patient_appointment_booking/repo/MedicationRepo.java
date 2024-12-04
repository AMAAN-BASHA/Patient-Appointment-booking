package com.example.patient_appointment_booking.repo;


import com.example.patient_appointment_booking.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicationRepo extends JpaRepository<Medication, Long> {
    boolean existsByPatientId(Long patientId);
    int deleteAllByPatientId(Long patientId);
    List<Medication> findAllByPatientId(Long patientId);
}
