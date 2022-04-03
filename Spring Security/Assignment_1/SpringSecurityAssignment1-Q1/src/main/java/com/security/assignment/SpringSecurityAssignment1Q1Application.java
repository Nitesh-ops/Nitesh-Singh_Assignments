package com.security.assignment;

/*1) Design and develop a Spring security Hello World application by using default login form
provided by spring security to secure URL access say, for example to access the content of an
“admin” page, user needs to enter valid credentials. User must also logged out if successfully
logged in.
Use Java Based and annotation based configuration and In-memory authentication.*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityAssignment1Q1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignment1Q1Application.class, args);
	}

}
