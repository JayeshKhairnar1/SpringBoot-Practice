package com.example.demo;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.controllers.PersonController;
import com.example.entities.Person;
import com.example.services.PersonService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonControllerTest {

	@Mock
	private PersonService pservice;
	
	private PersonController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller=new PersonController(pservice);
	}
	
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Order(2)
	void testAddPerson() {
		Person p=new Person();
		controller.addPerson(p);
		verify(pservice).addPerson(p);
	}

	@Test
	@Order(1)
	void testGetAllPersons() {
		controller.getAllPersons();
		verify(pservice,atLeastOnce()).getAllPersons();
	}

}
