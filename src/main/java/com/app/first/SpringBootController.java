package com.app.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class SpringBootController {
	@GetMapping("/hi")
	public String Welcome() {
		return "Welcome to SpringBoot";
		
	}

}
