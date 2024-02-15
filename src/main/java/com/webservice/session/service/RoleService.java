package com.webservice.session.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.session.model.dao.RoleDaoRepository;
import com.webservice.session.model.entity.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleDaoRepository roleDaoRepository;
	
	public Role save(Role role) {
		return roleDaoRepository.save(role);
	}

}
