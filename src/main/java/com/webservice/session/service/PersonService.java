package com.webservice.session.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.session.model.dao.PersonDaoRepository;
import com.webservice.session.model.entity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDaoRepository personDaoRepository;
	
	public Person savePerson(Person person) {
		return personDaoRepository.save(person);
	}
}
