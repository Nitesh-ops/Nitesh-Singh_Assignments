package com.security.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String home() {
		return "<h2>Welcome to home</h2>";
	}

	@GetMapping("/user")
	public String user() {
		return "<h2>Welcome User</h2>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h2>Welcome Admin</h2>";
	}
}
