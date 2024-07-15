package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Person;
import com.example.repositories.PersonRepository;

@Service
public class PersonManagerImpl implements PersonManager {

	@Autowired
	private PersonRepository repository;
	
	@Override
	public void addPerson(Person ref) {
		repository.save(ref);

	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
