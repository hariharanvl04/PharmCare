package com.project.pharmacare.service;

import java.util.Optional;

import com.project.pharmacare.entity.Prescription;

public interface PrescriptionService {
	public Prescription addPrescription(Prescription prescription);

	public Prescription updatePrescription(Prescription prescription);

	public Optional<Prescription> viewPrescription(int prescriptionId);

	public void removePrescription(int prescriptionId);
	


}
