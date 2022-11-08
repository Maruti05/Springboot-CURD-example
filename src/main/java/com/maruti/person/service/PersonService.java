package com.maruti.person.service;

import java.util.List;

import com.maruti.person.models.Person;

public interface PersonService {

	public Person insert(Person person);
	
	public Person getPerson(Integer id);
	
	public List<Person> getAllPerson();
	
	public String delete(Integer id);
	
	public Person update(Person person);
}
