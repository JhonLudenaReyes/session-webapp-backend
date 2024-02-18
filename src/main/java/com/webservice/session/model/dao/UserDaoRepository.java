package com.webservice.session.model.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.session.model.entity.User;

public interface UserDaoRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByUserAndPasswordAndState(String user, String password, String state);

}
