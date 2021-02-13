package com.mission_30;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Mission30Application {

	@RequestMapping("/")
	public String home() {
		return "Welcome to Employee Services";
	}
	public static void main(String[] args) {
		SpringApplication.run(Mission30Application.class, args);
	}

}
