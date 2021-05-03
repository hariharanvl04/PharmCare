package com.project.pharmacare.service;

import java.util.List;
import java.util.Optional;

import com.project.pharmacare.entity.Patient;

public interface PatientService {
	public Patient addPatient(Patient patient);

	public Patient updatePatient(Patient patient);

	public void removePatient(int patientId);

	public List<Patient> viewAllPatient();

	public Optional<Patient> findById(int patientId);

}
