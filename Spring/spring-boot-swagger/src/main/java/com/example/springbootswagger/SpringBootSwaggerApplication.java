package com.example.springbootswagger;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerApplication.class, args);
	}
}

@RestController
class AppController {

	List<Entity> entityList = new ArrayList<>();

	@GetMapping("/")
	public List<Entity> get() {
		return entityList;
	}

	@PostMapping("/entity")
	public Entity save(@RequestBody String name) {
		Entity entity = new Entity(UUID.randomUUID().toString(), name);
		entityList.add(entity);
		return entity;
	}

	@PutMapping("/entity/{entityId}")
	public List<Entity> update(@PathVariable String entityId, @RequestBody Entity entity) {
		entityList.forEach(entity1 -> {
			if(entity1.getId().equals(entityId)) {
				entity1.setName(entity.getName());
			}
		});
		return entityList;
	}
}

@Data
@AllArgsConstructor
class Entity {

	private String id;
	private String name;
}