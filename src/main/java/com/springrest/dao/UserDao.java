package com.springrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springrest.model.User;

public interface UserDao extends CrudRepository<User, Integer>{

}
