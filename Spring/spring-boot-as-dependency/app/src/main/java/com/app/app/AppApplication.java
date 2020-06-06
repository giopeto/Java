package com.app.app;

import com.appdependency.appdependency.AppDepService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class AppApplication {

	private AppService appService;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@PostConstruct
	public void init() {
		log.info("\n\n" + appService.hello() + "\n\n");
	}

}
