package com.uxpsystems.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.dao.UserRequestDAOManager;
import com.uxpsystems.assignment.entity.UserEntity;

/**
 * @author NandKumar R. Called from Entity service
 * for specific business implementation service calls.
 */
@Service
public class UserEntityServiceImpl implements UserEntityService {
	
	@Autowired
	UserRequestDAOManager userRequestDaoMgr;
	
	/** Implementation service for User entity
	 * creation or updation for a User.
	 * @param createEntity
	 */
	@Override
	public void createUpdateUserEntity(UserEntity createEntity) {
		 userRequestDaoMgr.save(createEntity);
	}
	
	/** 
	 * Implementation service for User entity fetch
	 */
	@Override
	public List<UserEntity> getAllUserEntities() {
		List <UserEntity> listEntities = new ArrayList<UserEntity>();
		Iterable<UserEntity> userEntities= userRequestDaoMgr.findAll();
		userEntities.forEach(listEntities::add);
		return listEntities;
	}
	
	/** Implementation service for User deletion.
	 * @param deleteUserID
	 */
	@Override
	public void deleteUserEntity(Long deleteUserID) {
		userRequestDaoMgr.delete(
				userRequestDaoMgr.findOne(deleteUserID));
	}
	
	
}
