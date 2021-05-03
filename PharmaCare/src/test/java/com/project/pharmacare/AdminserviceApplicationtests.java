package com.project.pharmacare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.pharmacare.entity.Admin;
import com.project.pharmacare.repository.AdminRepo;
import com.project.pharmacare.service.AdminService;

@SpringBootTest
class AdminServiceApplicationTest {
@MockBean
AdminRepo repo;
@Autowired
AdminService service;
	

@Test
	void testaddadminTure() {
		Admin admin = new Admin(1,"hariHaran@gmail.com","asd");
		when(repo.save(admin)).thenReturn(admin);
		Admin result = service.addAdmin(admin);
		assertEquals("hariHaran@gmail.com", result.getEmail());
	}
@Test
void testaddadminFalse() {
	Admin admin = new Admin(1,"hari@gmail.com","asd");
	when(repo.save(admin)).thenReturn(admin);
	Admin result = service.addAdmin(admin);
	assertEquals("asdsad", result.getEmail());
}
@Test
void testaddadmingmFalse() {
	Admin admin = new Admin(1,"hari@gmail.com","asd");
	when(repo.save(admin)).thenReturn(admin);
	Admin result = service.addAdmin(admin);
	assertEquals("asdsad", result.getPassword());
}
@Test
void testupdateadminTrue() {
	Admin admin = new Admin(1,"hariharan@gmail.com","asd");
	
	when(repo.save(admin)).thenReturn(admin);
	admin.setEmail("hari2@gmail.com");
	Admin result = service.updateAdmin(admin);
	assertEquals("hari2@gmail.com", result.getEmail());

}
@Test
void testupdateadminFalse() {
	Admin admin = new Admin(1,"hariharan04@gmail.com","asd");
	when(repo.save(admin)).thenReturn(admin);
	
	Admin result = service.updateAdmin(admin);
	assertEquals("harihn@gmail.com", result.getEmail());
}
@Test
void testupdateresponseFalse() {
	Admin admin = new Admin(1,"hariharan@gmail.com","asd");
	when(repo.save(admin)).thenReturn(admin);
	
	Admin result = service.updateAdmin(admin);
	assertEquals("hariharan", result.getPassword());
}

@Test
void testGetadminTure() {
	Admin admin = new Admin(400,"admin","pass");
	when(repo.findById(400)).thenReturn(Optional.of(admin));
	Optional<Admin> result = service.viewAdmin(400);
	assertTrue(result.isPresent());
}
 
}