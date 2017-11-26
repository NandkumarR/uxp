package com.uxpsystems.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.uxpsystems.assignment.entity.UserEntity;
import com.uxpsystems.assignment.service.UserEntityService;



/**
 * @author Nandkumar R
 * 
 * Junit class for testing the assignment service package
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value=AssignmentController.class,secure=false)
public class AssignmentControllerTest {
	
	@Autowired
	private MockMvc mockTestMVC;
	
	@MockBean
	UserEntityService userTestEntitySrv;
	
	List<UserEntity> resultEntities = new ArrayList<UserEntity>();
	
	
	/**
	 * Test method for validating the fetch method
	 * @throws Throwable
	 */
	@Test
	public void validateFetchUser() throws Throwable {
		
		UserEntity userEntityTest1 = new UserEntity();
		userEntityTest1.setUserID(new Long(1));
		userEntityTest1.setUserName("NandKumar");
		userEntityTest1.setUserPassword("abc@123");
		userEntityTest1.setUserActive(true);
		resultEntities.add(userEntityTest1);
		

		String expectedUser ="[{\"userID\":1,\"userName\":\"NandKumar\",\"userPassword\":\"abc@123\",\"isUserActive\":\"Activated\"}]";		
		// Mock the result object returned from DAO
		Mockito.when(userTestEntitySrv.getAllUserEntities()).thenReturn(resultEntities);
		
		// Preparing the requestbuilder
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/generic/UserFetchAllAPI")
									    .accept(org.springframework.http.MediaType.APPLICATION_JSON);
		MvcResult mvcResult= mockTestMVC.perform(requestBuilder).andReturn();
		// Comparison between the expected and returned value
		JSONAssert.assertEquals(expectedUser, mvcResult.getResponse().getContentAsString(), false);
		
	}

}
