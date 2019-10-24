package com.appspot.owhh.admin;

import com.appspot.owhh.admin.store.V1.groups.controller.GroupsController;
import com.appspot.owhh.admin.store.V1.groups.domain.Groups;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

@Slf4j
@SpringBootApplication
@EnableWebSecurity
public class OwhhAdminApplication {
	@Autowired
	GroupsController groupsController;
	public static void main(String[] args) {
		SpringApplication.run(OwhhAdminApplication.class, args);
	}

	@Bean
	public GridFSBucket getGridFSBuckets(MongoDbFactory mongoDbFactory) {
		return GridFSBuckets.create(mongoDbFactory.getDb());
	}

	@PostConstruct
	public void init(){
		log.info("Init method");
		IntStream.rangeClosed(1, 10).forEach(id -> groupsController.save(new Groups(Integer.toString(id), "Group TTTTT " + Integer.toString(id))));
		groupsController.get().forEach(group -> System.out.println(group.getId() + " " + group.getName()));
	}

}
