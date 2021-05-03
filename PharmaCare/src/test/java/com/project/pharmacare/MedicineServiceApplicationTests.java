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

import com.project.pharmacare.entity.Medicine;
import com.project.pharmacare.repository.MedicineRepo;
import com.project.pharmacare.service.MedicineService;

@SpringBootTest
class MedicineServiceApplicationTest {
@MockBean
MedicineRepo repo;
@Autowired
MedicineService service;
	

@Test
	void testaddmedicineTure() {
		Medicine medicine = new Medicine("what",50);
		when(repo.save(medicine)).thenReturn(medicine);
		Medicine result = service.addMedicine(medicine);
		assertEquals(50, result.getMedicineGrams());
	}
@Test
void testaddmedicineFalse() {
	Medicine medicine = new Medicine("what",50);
	when(repo.save(medicine)).thenReturn(medicine);
	Medicine result = service.addMedicine(medicine);
	assertEquals("asdsad", result.getMedicineName());
}
@Test
void testaddmedicinegmFalse() {
	Medicine medicine = new Medicine("what",50);
	when(repo.save(medicine)).thenReturn(medicine);
	Medicine result = service.addMedicine(medicine);
	assertEquals("asdsad", result.getMedicineGrams());
}
@Test
void testupdatemedicineTrue() {
	Medicine medicine = new Medicine("hi",5);
	when(repo.save(medicine)).thenReturn(medicine);
	
	Medicine result = service.updateMedicine(medicine);
	assertEquals("hi", result.getMedicineName());

}
@Test
void testupdatemedicineFalse() {
	Medicine medicine = new Medicine("how are you",5);
	when(repo.save(medicine)).thenReturn(medicine);
	
	Medicine result = service.updateMedicine(medicine);
	assertEquals(5, result.getMedicineName());

}
@Test
void testupdateresponseFalse() {
	Medicine medicine = new Medicine("asd",5);
	when(repo.save(medicine)).thenReturn(medicine);
	
	Medicine result = service.updateMedicine(medicine);
	assertEquals("I am fine", result.getMedicineGrams());

}

@Test
void testGetMedicineTure() {
	Medicine medicine = new Medicine(400,"medicine",50);
	when(repo.findById(400)).thenReturn(Optional.of(medicine));
	Optional<Medicine> result = service.viewMedicine(400);
	assertTrue(result.isPresent());
}
@Test
void testgetAllMedicineTure() {
	Medicine medicine = new Medicine(400,"medicine",50);
	List<Medicine> list = new ArrayList<Medicine>();
	list.add(medicine);
when(repo.findAll()).thenReturn(list);
List<Medicine> result = service.getAllMedicine();
assertEquals(result,list);


}
@Test
void testgetAllMedicineFalse() {
	Medicine medicine = new Medicine(400,"medicine",50);
	List<Medicine> list = new ArrayList<Medicine>();
	list.add(medicine);
when(repo.findAll()).thenReturn(list);
List<Medicine> result = service.getAllMedicine();
assertTrue(result.isEmpty());


} 
}