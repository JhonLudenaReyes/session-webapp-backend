package com.webservice.session.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.session.model.entity.Role;

public interface RoleDaoRepository extends JpaRepository<Role, Integer>{

}
