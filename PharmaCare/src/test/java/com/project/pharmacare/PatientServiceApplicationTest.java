package com.project.pharmacare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.pharmacare.entity.Patient;
import com.project.pharmacare.repository.PatientRepo;
import com.project.pharmacare.service.PatientService;

@SpringBootTest
 class PatientServiceApplicationTest {
	@MockBean
	PatientRepo repo;
	@Autowired
	PatientService service;

	@Test
	void TestaddPatienttrue() {
		Patient patient = new Patient(1, "Ajith", 123456789, "Ajith@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Patient result = service.addPatient(patient);
		assertEquals(1, result.getPatientId());
	}

	@Test
	void TestaddPatientFalse() {
		Patient patient = new Patient(1, "Ajith", 123456789, "Ajith@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Patient result = service.addPatient(patient);
		assertEquals("TALIVA", result.getPatientName());
	}

	@Test
	void TestaddPatientFalse1() {
		Patient patient = new Patient(1, "Ajith", 123456789, "Ajith@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Patient result = service.addPatient(patient);
		assertEquals("number", result.getPatientPhoneNo());
	}

	@Test
	void TestupdatePatienttrue() {
		Patient patient = new Patient(1, "sanjay", 123456789, "Sujith@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Patient result = service.updatePatient(patient);
		assertEquals(1, result.getPatientId());
	}

	@Test
	void TestupdatePatientFalse() {
		Patient patient = new Patient(1, "balaji", 123456789, "balu@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Patient result = service.updatePatient(patient);
		assertEquals("balu", result.getPatientName());
	}

	@Test
	void TestupdatePatientFalse1() {
		Patient patient = new Patient(1, "arun", 123456789, "arun@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Patient result = service.updatePatient(patient);
		assertEquals("number", result.getPatientPhoneNo());
	}

	@Test
	void TestremovePatientByIdTrue() {
		Patient patient = new Patient(1, "arun", 123456789, "arun@patient.com");
		service.addPatient(patient);
		service.removePatient(1);
		Optional<Patient> removedPatient =service.findById(1);
		assertEquals(Optional.empty(),removedPatient);
	}




	
	@Test
	void TestFindPatientByIdTrue() {
		Patient patient = new Patient(1, "arun", 123456789, "arun@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Optional<Patient> result = service.findById(1);
		assertTrue(result.isPresent());
	}
	@Test
	void TestFindPatientByIdFalse() {
		Patient patient = new Patient(1, "arun", 123456789, "arun@patient.com");
		when(repo.save(patient)).thenReturn(patient);
		Optional<Patient> result = service.findById(3000);
		assertTrue(result.isPresent());
	}
}
