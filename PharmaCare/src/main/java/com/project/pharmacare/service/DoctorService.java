package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import com.project.pharmacare.entity.Doctor;

public interface DoctorService {
	public Doctor addDoctor(Doctor doctor);

	public Doctor updateDoctor(Doctor doctor);

	public Optional<Doctor> getDoctorById(int doctorId);

	public void deleteDoctorById(int doctorId);

	public List<Doctor> getAllDoctors();

}
