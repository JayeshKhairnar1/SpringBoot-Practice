package com.example.demo;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entities.Person;
import com.example.repositories.PersonRepository;
import com.example.services.PersonService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonServiceTest {

	@Mock
	private PersonRepository prepository;
	
	
	private PersonService pservice;
	
	@BeforeEach
	void setUp()
	{
		pservice=new PersonService(this.prepository);
	}
	
	
	  @Test 
	  @Order(2)
	  void testGetAllPersons() {
	  System.out.println("testgetallpersons");
	  pservice.getAllPersons(); verify(prepository).findAll(); }
	 
	@Test
	@Order(1)
	void testaddPerson() {
		 System.out.println("testaddperson");
		Person p=new Person();
		pservice.addPerson(p);
		verify(prepository).save(p);
	}


}
