package com.webservice.session.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.session.model.entity.Person;

public interface PersonDaoRepository extends JpaRepository<Person, Integer>{

}
