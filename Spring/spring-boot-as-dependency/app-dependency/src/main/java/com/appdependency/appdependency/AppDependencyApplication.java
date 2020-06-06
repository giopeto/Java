package com.appdependency.appdependency;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class AppDependencyApplication {

	private final AppDepService appDepService;

	public static void main(String[] args) {
		SpringApplication.run(AppDependencyApplication.class, args);
	}

	@PostConstruct
	public void init() {
		log.info("\n\n" + appDepService.hello() + "\n\n");
	}
}
