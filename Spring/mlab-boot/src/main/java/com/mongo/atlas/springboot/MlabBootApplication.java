package com.mongo.atlas.springboot;

import com.mongo.atlas.springboot.groups.controller.GroupsController;
import com.mongo.atlas.springboot.groups.domain.Groups;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

@Slf4j
@SpringBootApplication
public class MlabBootApplication {

	@Autowired
	GroupsController groupsController;

	public static void main(String[] args) {
		SpringApplication.run(MlabBootApplication.class, args);
	}

	@PostConstruct
	public void init(){
		log.info("Init method");
		IntStream.rangeClosed(1, 10).forEach(id -> groupsController.save(new Groups(Integer.toString(id), "Group " + Integer.toString(id))));
		groupsController.get().forEach(group -> System.out.println(group.getId() + " " + group.getName()));
	}

}