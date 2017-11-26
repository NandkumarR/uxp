package com.uxpsystems.assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;;

/**
 * @author Nandkumar R
 * Creating an entity class  
 * for ORM Data base table USER_ENTITY 
 *
 */
@Entity
@Table (name = "USER_ENTITY")
public class UserEntity {
	
	@Id
	@Column (name = "USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userID;
	
	@Column (name = "USER_NAME")
	private String userName;
	
	@Column (name = "USER_PASSWORD")
	private String userPassword;
	
	@Column (name = "IS_ACTIVE")
	private boolean isUserActive;

	/* getter and setters for corresponding 
	 * columns 
	 * */
	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getisUserActive() {
		return (isUserActive==true ? "Activated":"Deactivated");
	}

	public void setUserActive(boolean isUserActive) {
		this.isUserActive = isUserActive;
	}
	
	

}
