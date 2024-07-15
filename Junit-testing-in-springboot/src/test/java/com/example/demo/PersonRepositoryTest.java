package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entities.Person;
import com.example.repositories.PersonRepository;
import org.junit.jupiter.api.MethodOrderer;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonRepositoryTest {

	@Autowired
	private PersonRepository repository;
	
	@Test
	@Order(2)
	void testIsPersonExistsById() {
		System.out.println("ispersonexistsbyid method");
		Person p=new Person();
		p.setName("Abc");
		p.setCity("Mumbai");
		repository.save(p);
		
		boolean result=repository.isPersonExistsById(p.getId());
		assertThat(result).isTrue();
	}
	
	@Test
	@Order(1)
	void testgetAllPersons()
	{
		System.out.println("getAllPerson method");
		List<Person> mylist=repository.findAll();
		assertThat(mylist.size()).isGreaterThan(0);
	}
	
	@BeforeEach
	void setUp()
	{
		System.out.println("Setting up");
	}


}
