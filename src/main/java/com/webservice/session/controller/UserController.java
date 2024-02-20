package com.webservice.session.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.session.model.entity.User;
import com.webservice.session.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@CrossOrigin(origins = "http://localhost:5173")
	@GetMapping("/session-login")
	public ResponseEntity<User> getUserLogin(@RequestParam("user") String user, @RequestParam("password") String password){
		System.out.println(user);
		return userService.getUserLogin(user, password)
				.map(userLogin -> new ResponseEntity<>(userLogin, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@CrossOrigin(origins = "http://localhost:5173")
	@PostMapping("/save-user")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
	}
}
