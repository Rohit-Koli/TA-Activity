package com.TA_Activity.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/msg")
	public String msg() {
		return "hello";
	}
}
