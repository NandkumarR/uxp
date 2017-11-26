package com.uxpsystems.assignment.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.uxpsystems.assignment.entity.UserEntity;

/**
 * @author NandKumar 
 * This is the User request Interface
 * that define the behavior of DAO implementations. Default Crudrepository implemented
 * which provides basic CRUD operations.
 */
@Component
public interface UserRequestDAOManager extends CrudRepository<UserEntity, Long> {

	
}
