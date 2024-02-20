package com.webservice.session.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.session.model.entity.Person;
import com.webservice.session.service.PersonService;

@RestController
@RequestMapping("people")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@CrossOrigin(origins = "http://localhost:5173")
	@PostMapping("/person-save")
	public ResponseEntity<Person> savePerson(@RequestBody Person person){
		return new ResponseEntity<>(personService.savePerson(person), HttpStatus.CREATED);
	}
}
