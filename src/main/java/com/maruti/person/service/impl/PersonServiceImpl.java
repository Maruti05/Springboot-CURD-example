package com.maruti.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maruti.person.models.Person;
import com.maruti.person.repo.PersonRepo;
import com.maruti.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepo personRepo;

	@Override
	public Person insert(Person person) {
		
		return personRepo.save(person);
	}

	@Override
	public Person getPerson(Integer id) {
		// TODO Auto-generated method stub
		return personRepo.findById(id).get();
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		personRepo.deleteById(id);
		return "person deleted ";
	}

	@Override
	public Person update(Person person) {
		// TODO Auto-generated method stub
		return personRepo.save(person);
	}

}
