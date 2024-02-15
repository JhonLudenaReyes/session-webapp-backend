package com.webservice.session.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.session.model.entity.Role;
import com.webservice.session.service.RoleService;

@RestController
@RequestMapping("roles")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@CrossOrigin(origins = "http://localhost:5173")
	@PostMapping("/role-save")
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		return new ResponseEntity<>(roleService.save(role), HttpStatus.CREATED);
	}

}
