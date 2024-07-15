package com.example.services;

import java.util.List;

import com.example.entities.Person;

public interface PersonManager 
{
	void addPerson(Person ref);
	List<Person> getAllPersons();
}
