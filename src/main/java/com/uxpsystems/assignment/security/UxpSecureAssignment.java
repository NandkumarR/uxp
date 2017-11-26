package com.uxpsystems.assignment.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Nandkumar . Class implements basic user authentication
 * for any REST API call.
 *
 */
@Configuration

public class UxpSecureAssignment extends WebSecurityConfigurerAdapter   {

	/**
	 * Configures an in memory users for REST API call validation
	 * Thre level of users are configured User Read and Admin
	 *  */
	@Override
	protected void configure(AuthenticationManagerBuilder authenticateManager) throws Exception {
		System.out.println("sets the authentication manager..");
		authenticateManager.inMemoryAuthentication()
		.withUser("UXPGeneral").password("uxp@123").roles("USER")
		.and()
		.withUser("UXPReadOnly").password("uxp@123").roles("READ")
		.and()
		.withUser("UXPAdmin").password("uxp@123").roles("ADMIN");
	}

	/** 
	 * Enforces validation of the API calls based on the
	 *  user roles defined
	 *  Add/Update/View - User role has access
	 *  Delete - Admin role has access
	 *  View - Read role has access 
	 * */
	@Override
	protected void configure(HttpSecurity httpRequest) throws Exception {
		System.out.println("validation of security.."+httpRequest.toString());
		httpRequest.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/assignment/internal/**")
				 .hasRole("USER")
		.antMatchers("/assignment/generic/**")
				 .hasRole("READ")
    	.antMatchers("/assignment/admin/**")
				 .hasRole("ADMIN")					 
	    .and()
		.csrf().disable()
		.headers().frameOptions().disable();
	}

	
}
