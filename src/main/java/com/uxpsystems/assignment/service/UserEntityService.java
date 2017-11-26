package com.uxpsystems.assignment.service;

import java.util.List;

import com.uxpsystems.assignment.entity.UserEntity;

/**
 * @author Nandkumar
 * Interface service for defining behavior
 * of the service Implementations
 */
public interface UserEntityService {
	
	/**
	 * Service implementation for User creation or updation
	 * @param createEntity
	 */
	void createUpdateUserEntity(UserEntity createEntity) ;
	
	/**
	 * Service implementation to fetch all user entities
	 * 
	 */
	List <UserEntity> getAllUserEntities();
	
	/**
	 * Service implementation for deleting a user
	 * @param deleteUserEntity
	 */
	void deleteUserEntity(Long deleteUserEntity);

}
