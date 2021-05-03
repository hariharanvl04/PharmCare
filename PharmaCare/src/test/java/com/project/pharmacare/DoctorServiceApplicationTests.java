package com.project.pharmacare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.pharmacare.entity.Doctor;
import com.project.pharmacare.repository.DoctorRepo;
import com.project.pharmacare.service.DoctorService;

@SpringBootTest
class DoctorServiceApplicationTests {
	@MockBean
	DoctorRepo repo;
	@Autowired
	DoctorService service;

	@Test
	void TestaddDoctortrue() {
		Doctor doctor = new Doctor(1, "ajith", 1234567890, "ABC@doctor.com", "Hyderabad", 1000);
		when(repo.save(doctor)).thenReturn(doctor);
		Doctor result = service.addDoctor(doctor);
		assertEquals(1, result.getDoctorId());
	}

	@Test
	void TestaddDoctorFalse() {
		Doctor doctor = new Doctor(1, "ajith", 1234567890, "ABC@doctor.com", "Hyderabad", 1000);
		when(repo.save(doctor)).thenReturn(doctor);
		Doctor result = service.addDoctor(doctor);
		assertEquals("TALIVA", result.getDoctorName());
	}

	@Test
	void TestaddDoctorFalse1() {
		Doctor doctor = new Doctor(1, "ajith", 1234567890, "ABC@doctor.com", "Hyderabad", 1000);
		when(repo.save(doctor)).thenReturn(doctor);
		Doctor result = service.addDoctor(doctor);
		assertEquals("number", result.getDoctorPhone());
	}

	@Test
	void TestupdateDoctortrue() {
		Doctor doctor = new Doctor(1, "ajith", 1234567890, "ABC@doctor.com", "Hyderabad", 1000);
		when(repo.save(doctor)).thenReturn(doctor);
		Doctor result = service.updateDoctor(doctor);
		assertEquals(1, result.getDoctorId());
	}

	@Test
	void TestupdateDoctorFalse() {
		Doctor doctor = new Doctor(1, "Sujith", 1234554321, "XYZ@doctor.com", "Chennai", 2000);
		when(repo.save(doctor)).thenReturn(doctor);
		Doctor result = service.updateDoctor(doctor);
		assertEquals("TALIVA", result.getDoctorName());
	}

	@Test
	void TestupdateDoctorFalse1() {
		Doctor doctor = new Doctor(1, "Balaji", 123654987, "BALU@doctor.com", "Banglore", 3000);
		when(repo.save(doctor)).thenReturn(doctor);
		Doctor result = service.updateDoctor(doctor);
		assertEquals("number", result.getDoctorPhone());
	}

	@Test
	void TestdeleteDoctorByIdtrue() {
		Doctor doctor = new Doctor(1, "Balaji", 123654987, "BALU@doctor.com", "Banglore", 3000);
		service.addDoctor(doctor);
		service.deleteDoctorById(1);
		
		Optional<Doctor> removedDoctor = service.getDoctorById(1);
		assertEquals(Optional.empty(), removedDoctor);
	}

	@Test
	void TestdeleteDoctorByIdFalse() {
		Doctor doctor = new Doctor(1, "Balaji", 123654987, "BALU@doctor.com", "Banglore", 3000);
		service.addDoctor(doctor);
		service.deleteDoctorById(3);
		
		Optional<Doctor> removedDoctor = service.getDoctorById(1);
		assertEquals(false,removedDoctor.isEmpty());
	}

	@Test
	void TestdeleteDoctorByIdFalse1() {
		Doctor doctor = new Doctor(1, "Balaji", 123654987, "BALU@doctor.com", "Banglore", 3000);
		service.addDoctor(doctor);
		service.deleteDoctorById(300);
		;
		Optional<Doctor> removedDoctor = service.getDoctorById(1);
		assertEquals(Optional.empty(), removedDoctor);
	}

	@Test
	void TestgetDoctorByIdTrue() {
		Doctor doctor = new Doctor(300, "Balaji", 123654987, "BALU@doctor.com", "Banglore", 3000);
		service.addDoctor(doctor);
		Optional<Doctor> result = service.getDoctorById(300);
		assertTrue(result.isPresent());
	}

	@Test
	void TestgetDoctorByIdFalse() {
		Doctor doctor = new Doctor(1, "Balaji", 123654987, "BALU@doctor.com", "Banglore", 3000);
		when(repo.save(doctor)).thenReturn(doctor);
		Optional<Doctor> result = service.getDoctorById(3);
		assertTrue(result.isPresent());
	}

	@Test
	void TestgetDoctorByIdFalse1() {
		Doctor doctor = new Doctor(1, "Balaji", 123654987, "BALU@doctor.com", "Banglore", 3000);
		when(repo.save(doctor)).thenReturn(doctor);
		Optional<Doctor> result = service.getDoctorById(300);
		assertTrue(result.isPresent());
	}

}
