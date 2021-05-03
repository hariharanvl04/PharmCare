package com.project.pharmacare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.pharmacare.entity.CallPatient;
import com.project.pharmacare.entity.QuerryResponse;
import com.project.pharmacare.repository.CallPatientRepo;
import com.project.pharmacare.service.CallPatientService;

@SpringBootTest
class CallPatientApplicationTest {
	@MockBean
	private CallPatientRepo repo;
	@Autowired
	private CallPatientService service;

	@Test
	void testaddCallPaitentTure() {
		QuerryResponse querry = new QuerryResponse(1, "het", "hi");
		List<QuerryResponse> list = new ArrayList<QuerryResponse>();
		list.add(querry);
		CallPatient call = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");

		when(repo.save(call)).thenReturn(call);

		CallPatient result = service.addCall(call);
		assertEquals("hari", result.getPatientName());

	}

	@Test
	void testaddCallPaitentFalse() {
		QuerryResponse querry = new QuerryResponse(1, "het", "hi");
		List<QuerryResponse> list = new ArrayList<QuerryResponse>();
		list.add(querry);
		CallPatient call = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");

		when(repo.save(call)).thenReturn(call);

		CallPatient result = service.addCall(call);
		assertEquals("ram", result.getPatientName());

	}

	@Test
	void testaddCallPaitentFalse1() {

		CallPatient call = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");

		when(repo.save(call)).thenReturn(call);

		CallPatient result = service.addCall(call);
		assertEquals(123, result.getPatientName());

	}

	@Test
	void testupdateCallPatientTrue() {
		CallPatient call = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");
		when(repo.save(call)).thenReturn(call);
		call.setPatientName("hariharan");
		CallPatient result = service.updateCall(call);
		assertEquals("hariharan", result.getPatientName());
	}

	@Test
	void testupdateCallPatientFalse() {
		CallPatient call = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");
		when(repo.save(call)).thenReturn(call);
		call.setPatientName("hariharan");
		CallPatient result = service.updateCall(call);
		assertEquals("hari", result.getPatientName());
	}

	@Test
	void testupdateCallPatientfasle() {
		CallPatient call = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");
		when(repo.save(call)).thenReturn(call);
		call.setPatientName("hariharan");
		CallPatient result = service.updateCall(call);
		assertEquals("", result.getPatientName());
	}
	@Test
	void testviewCallPateintTrue() {
		CallPatient call1 = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");
		repo.save(call1);
		when(repo.findBycallId(1)).thenReturn(Optional.of(call1));
		Optional<CallPatient> call = service.getCallById(1);
	
		assertTrue(call.isPresent());
		
	}
	void testviewCallPateintFalse() {
		CallPatient call1 = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");
		repo.save(call1);
		when(repo.findBycallId(1)).thenReturn(Optional.of(call1));
		Optional<CallPatient> call = service.getCallById(1);
	
		assertTrue(call.isEmpty());
		
	}
	@Test
	void testDeleteCallPateintTrue() {
		CallPatient call1 = new CallPatient(1, "hari", "ram", 12345, 65432, "pending", "no");
		repo.save(call1);
		service.deleteCall(44);
		Optional<CallPatient> admin1 = service.getCallById(44);
		assertEquals(Optional.empty(), admin1);
		
	}

}
