package com.example.mavenchild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MavenChildApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenChildApplication.class, args);
	}

	@RestController
	public class MainController {

		@GetMapping
		public String home() {
			return "Home";
		}
	}
}

