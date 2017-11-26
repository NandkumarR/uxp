package com.uxpsystems.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Nandkumar R 
 * Implementing a REST API assignment using
 * Spring boot. Main class called during
 *spring boot up
 */
@SpringBootApplication
@EnableWebMvc
public class UxpApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    SpringApplication.run(UxpApplication.class, args);
		
	}

}
