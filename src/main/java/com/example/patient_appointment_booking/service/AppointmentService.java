package com.example.patient_appointment_booking.service;


import com.example.patient_appointment_booking.dto.AppointmentDto;
import com.example.patient_appointment_booking.dto.DoctorDto;
import com.example.patient_appointment_booking.dto.SaveAppointmentDto;
import com.example.patient_appointment_booking.dto.SlotDto;

import java.util.List;

public interface AppointmentService {
    List<AppointmentDto> getAllAppointments();

    AppointmentDto getAppointmentById(Long id);

    AppointmentDto createAppointment(SaveAppointmentDto saveAppointmentDto);

    String deleteAppointment(Long id);

    boolean existsByDoctorId(Long doctorId);

    void deleteAllAppointmentByDoctorId(Long doctorId);

    boolean existsByPatientId(Long id);

    void deleteAllAppointmentByPatientId(Long id);

    List<List<AppointmentDto>> getAllAppointmentByUsername(String name);

    List<DoctorDto> getDoctorsBySpeciality(String specialty);

    List<String> getAllDoctorSpecialties();
    List<SlotDto> getAvailableSlots(Long doctorId, String date);

    Long getPatientIdByUsername(String name);
}
