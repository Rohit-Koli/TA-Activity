package com.TA_Activity.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/msg")
	public String msg() {
		return "hello";
	}
	
	@GetMapping("/api/users/{id}")
    public String getUser(@PathVariable String id) {
        // Mock user retrieval; in a real app, this would likely involve a service layer
        return "User" + id;
    }
}
