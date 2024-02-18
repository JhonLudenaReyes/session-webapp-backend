package com.webservice.session.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.session.model.dao.UserDaoRepository;
import com.webservice.session.model.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDaoRepository userDaoRepository;
	
	public Optional<User> getUserLogin(String User, String password){
		return userDaoRepository.findByUserAndPasswordAndState(User, password, "A");
	}
}
