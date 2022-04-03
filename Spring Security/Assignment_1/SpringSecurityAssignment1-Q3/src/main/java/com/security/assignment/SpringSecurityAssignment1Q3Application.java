package com.security.assignment;

/*3) Modify the above application and use database authentication using JDBC instead of Inmemory authentication.
Use Java Based and annotation based configuration and In-memory authentication.*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityAssignment1Q3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignment1Q3Application.class, args);
	}

}
