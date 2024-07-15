package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Person;
import com.example.services.PersonManager;

import jakarta.validation.Valid;

@RestController
public class PersonController 
{
	@Autowired
	private PersonManager manager;
	
	@PostMapping("/addPerson")
	public void addPerson(@Valid @RequestBody Person person)
	{
		manager.addPerson(person);
	}
	@GetMapping("/getPersons")
	public List<Person> getAllPersons()
	{
		return manager.getAllPersons();
	}
}
