package com.project.pharmacare.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.project.pharmacare.entity.CallPatient;
import com.project.pharmacare.entity.Doctor;
import com.project.pharmacare.entity.Medicine;
import com.project.pharmacare.entity.Patient;
import com.project.pharmacare.entity.Pharmacist;
import com.project.pharmacare.entity.Prescription;
import com.project.pharmacare.entity.QuerryResponse;

@Component
public class Validate {

	public boolean validateEmail(String adminEmail) {
		 String regex = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regex);  
		 Matcher matcher = pattern.matcher(adminEmail); 
		 return matcher.matches();
	}

	public boolean validateById(int prescriptionId) {
		if (prescriptionId <= 0) {
			return false;
		}
		return true;
	}

	public boolean validatePrescription(Prescription prescription) {
		if (prescription.getPatientId() == 0 || prescription.getPatientName() == null
				|| prescription.getMedicine().isEmpty() || prescription.getDate() == null) {
			return false;
		}
		return true;
	}

	public boolean validatePharmacist(Pharmacist pharmacist) {
		if (pharmacist.getPharmacistId() == 0 || pharmacist.getPhoneNo() == 0 || pharmacist.getEmail() == null
				|| pharmacist.getPharmaLocality() == null || pharmacist.getCostPerMg() == 0) {
			return false;
		}
		return true;
	}

	public boolean validatecallPatient(CallPatient callpatient) {
		if (callpatient.getPatientName() == null || callpatient.getPatientNumber() == 0 || callpatient.getCallId() <= 0
				) {
			return false;
		}
		return true;
	}

	public boolean validateDoctor(Doctor doctor) {
		if (doctor.getDoctorName() == null || doctor.getDoctorPhone() == 0 || doctor.getDoctorId() <= 0
				|| doctor.getDoctorEmail() == null) {
			return false;
		}
		return true;
	}

	public boolean validateDoctorById(int doctorId) {
		if(doctorId <= 0) 
			return false;
		

		return true;
	}

	public boolean validatePatient(Patient patient) {
		if (patient.getPatientName() == null || patient.getPatientPhoneNo() == 0 || patient.getPatientId() <= 0
				|| patient.getPatientEmail() == null) {
			return false;
		}
		return true;
	}

	public boolean validatePatientById(int patientId) {
		if (patientId <= 0) {
			return false;
		}
		return true;
	}

	public boolean validateQuerry(QuerryResponse querry) {
		if (querry.getpharmQuerry() == null ) {
			return false;
		}
		return true;
	}

	public boolean validateResponse(QuerryResponse querry) {
		if (querry.getResponse() == null ) {
			return false;
		}
		return true;
	}

	public boolean validateMedicine(Medicine medicine) {
		if (medicine.getMedicineName() == null || medicine.getMedicineGrams() == 0) {
			return false;
		}
		return true;
	}

	public boolean validateMedicineById(int medicineId) {
		if (medicineId <= 0) {
			return false;
		}
		return true;
	}
}
