package com.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String getAll() {
		return "<h1> Welcome All </h1>";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "<h1> Welcome User </h1>";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "<h1> Welcome Admin </h1>";
	}

}
