package com.project.pharmacare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.pharmacare.entity.Pharmacist;
import com.project.pharmacare.repository.PharmacistRepo;
import com.project.pharmacare.service.PharmacistService;

@SpringBootTest
class PharmacistServiceApplicationTest {
@MockBean
PharmacistRepo repo;
@Autowired
PharmacistService service;
	

@Test
	void testaddPharmacistTure() {
		Pharmacist pharmacist = new Pharmacist(1,"hari",4545454, "hari@gmail.com","chennai" , 10);
		when(repo.save(pharmacist)).thenReturn(pharmacist);
		Pharmacist result = service.addPharmacist(pharmacist);
		assertEquals("hari@gmail.com", result.getEmail());
	}
@Test
void testaddPharmacistFalse() {
	Pharmacist pharmacist = new Pharmacist(1,"hari",4545454, "hari@gmail.com","chennai" , 10);
	when(repo.save(pharmacist)).thenReturn(pharmacist);
	Pharmacist result = service.addPharmacist(pharmacist);
	assertEquals("asdsad", result.getEmail());
}
@Test
void testaddPharmacistgmFalse() {
	Pharmacist pharmacist = new Pharmacist(1,"hari",4545454, "hari@gmail.com","chennai" , 10);
	when(repo.save(pharmacist)).thenReturn(pharmacist);
	Pharmacist result = service.addPharmacist(pharmacist);
	assertEquals("asdsad", result.getPharmaLocality());
}
@Test
void testupdatePharmacistTrue() {
	Pharmacist pharmacist = new Pharmacist(1,"hari",4545454, "hari@gmail.com","chennai" , 10);
	when(repo.save(pharmacist)).thenReturn(pharmacist);
	
	Pharmacist result = service.updatePharmacist(pharmacist);
	assertEquals("hariharan@gmail.com", result.getEmail());

}
@Test
void testpdatePharmacistFalse() {
	Pharmacist pharmacist = new Pharmacist(1,"hari",4545454, "hari@gmail.com","chennai" , 10);
	when(repo.save(pharmacist)).thenReturn(pharmacist);
	
	Pharmacist result = service.updatePharmacist(pharmacist);
	assertEquals("harihn@gmail.com", result.getEmail());
}
@Test
void testUpdatePharmacistFalse() {
	Pharmacist pharmacist = new Pharmacist(1,"hari",4545454, "hari@gmail.com","chennai" , 10);
	when(repo.save(pharmacist)).thenReturn(pharmacist);
	
	Pharmacist result = service.updatePharmacist(pharmacist);
	assertEquals(1234, result.getPhoneNo());
}

@Test
void testGetAllPharmacistTure() {
	Pharmacist pharmacist = new Pharmacist(1,"hari",4545454, "hari@gmail.com","chennai" , 10);
	List<Pharmacist> list = new ArrayList<Pharmacist>();
	list.add(pharmacist);
when(repo.findAll()).thenReturn(list);
List<Pharmacist> result = service.viewPharmacist();
	assertEquals(result,list);
}
 
}