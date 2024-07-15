package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
