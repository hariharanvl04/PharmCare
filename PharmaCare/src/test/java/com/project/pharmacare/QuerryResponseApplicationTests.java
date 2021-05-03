package com.project.pharmacare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.pharmacare.entity.QuerryResponse;
import com.project.pharmacare.repository.QuerryResponseRepo;
import com.project.pharmacare.service.QuerryResponseService;

@SpringBootTest
class QuerryResponseApplicationTests {
@MockBean
QuerryResponseRepo repo;
@Autowired
QuerryResponseService service;
	

@Test
	void TestaddquerryTrue() {
		QuerryResponse querry = new QuerryResponse(1,"what","hi");
		when(repo.save(querry)).thenReturn(querry);
		QuerryResponse result = service.addQuerry(querry);
		assertEquals("what", result.getpharmQuerry());

	}
@Test
void TestaddquerryFalse() {
	QuerryResponse querry = new QuerryResponse(1,"what","hi");
	when(repo.save(querry)).thenReturn(querry);
	QuerryResponse result = service.addQuerry(querry);
	assertEquals("what111", result.getpharmQuerry());

}
@Test
void TestaddresponseFalse() {
	QuerryResponse querry = new QuerryResponse(1,"what","hi");
	when(repo.save(querry)).thenReturn(querry);
	QuerryResponse result = service.addQuerry(querry);
	assertEquals("what111", result.getResponse());

}
@Test
void TestupdatequerryTrue() {
	QuerryResponse querry = new QuerryResponse(1,"how are you","hi");
	when(repo.save(querry)).thenReturn(querry);
	
	QuerryResponse result = service.updateQuerry(querry);
	assertEquals("how are you", result.getpharmQuerry());

}
@Test
void TestupdatequerryFalse() {
	QuerryResponse querry = new QuerryResponse(1,"how are you","hi");
	when(repo.save(querry)).thenReturn(querry);
	
	QuerryResponse result = service.updateQuerry(querry);
	assertEquals("what", result.getpharmQuerry());

}
@Test
void TestupdateresponseTrue() {
	QuerryResponse querry = new QuerryResponse(1,"how are you","I am fine");
	when(repo.save(querry)).thenReturn(querry);
	
	QuerryResponse result = service.updateQuerry(querry);
	assertEquals("I am fine", result.getResponse());

}
@Test
void TestupdateresponseFalse() {
	QuerryResponse querry = new QuerryResponse(1,"how are you","I am fine");
	when(repo.save(querry)).thenReturn(querry);
	
	QuerryResponse result = service.updateQuerry(querry);
	assertEquals("hi", result.getResponse());

}

@Test
void TestviewQuerryResponseTure() {
	QuerryResponse QuerryResponse = new QuerryResponse(200, "dummyname", "dummyemail");
	List<QuerryResponse> list = new ArrayList<QuerryResponse>();
	list.add(QuerryResponse);
	when(repo.findAll()).thenReturn(list);
	List<QuerryResponse> result = service.viewQuerry();
	assertEquals(result, list);
	
}
@Test
void TestviewQuerryResponseFalse() {
	QuerryResponse QuerryResponse = new QuerryResponse(200, "dummyname", "dummyemail");
	List<QuerryResponse> list = new ArrayList<QuerryResponse>();
	list.add(QuerryResponse);
	when(repo.findAll()).thenReturn(list);
	List<QuerryResponse> result = service.viewQuerry();
	assertTrue(result.isEmpty());
	
}
}
