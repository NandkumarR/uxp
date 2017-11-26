package com.uxpsystems.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uxpsystems.assignment.entity.UserEntity;
import com.uxpsystems.assignment.service.UserEntityService;

/**
 * @author Nandkumar R 
 * The class is the controller class
 *that receives the spring boot requests
 *and redirects to respective service layers
 *Ideally there should be a VO object interfacing
 * between VO to EntityObject else its a
 * MassAssignment Violation as per Security standards.
 * Excluding VO as its not expected per guidelines published for
 * assignment.
 */

@Controller
public class AssignmentController {
	
	/**
	 * Service layer class autowired for executing
	 * various business services
	 */
	@Autowired
	UserEntityService userEntityService;
	
	/**
	 * Called in for creating a new user in the system. Depicts a POST request
	 * @param createUser
	 * @return a view template for successful
	 * completion of operation
	 */
	@RequestMapping(value="/internal/UserAddAPI", method=RequestMethod.POST)
	public String createUserEntity(@RequestBody UserEntity createUser){
		userEntityService.createUpdateUserEntity(createUser);
		return "Success";
	}
	
	/**
	 * Called in for updating an existing user in the system. Depicts a PUT request
	 * @param updateUser
	 * @return a view template for successful
	 * completion of operation
	 */
	@RequestMapping(value="/internal/UserUpdateAPI", method=RequestMethod.PUT)
	public String updateUserEntity(@RequestBody UserEntity updateUser){
		userEntityService.createUpdateUserEntity(updateUser);
		return "Success";
	}
	
	/**
	 * Called in for fetching all the added users in the system. Depicts a GET request
	 * @return a response entity which sends out the list automatically 
	 * converted into JSON
	 */
	@RequestMapping(value="/generic/UserFetchAllAPI",method=RequestMethod.GET)
	public ResponseEntity<List<UserEntity>> getAllUserEntity() {
		return new ResponseEntity<List<UserEntity>> (userEntityService.getAllUserEntities(),HttpStatus.OK);
	}
	
	/**
	 * Called in for deleting a user from the system. Depicts a DELETE request
	 * @return a view template for successful
	 * completion of operation
	 */
	@RequestMapping(value="/admin/UserDeleteAPI/{deleteUserID}",method=RequestMethod.DELETE)
	public String deleteUserEntity(@PathVariable Long deleteUserID) {
		userEntityService.deleteUserEntity(deleteUserID);
		return "Success";
	}
}
