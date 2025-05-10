package com.sanjib.edureka.ms_config_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello World!";
	}
}
