package com.mlabboot;

import com.mlabboot.groups.controller.GroupsController;
import com.mlabboot.groups.domain.Groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MlabBootApplication {

	@Autowired
	GroupsController groupsController;
	public static void main(String[] args) {
		SpringApplication.run(MlabBootApplication.class, args);
	}

	@PostConstruct
	public void init(){
		System.out.println("Init method");
		for (int i = 200; i <= 300; i++) {
			groupsController.save(new Groups(Integer.toString(i), "Group " + Integer.toString(i)));
		}
	}

}

/*
@Document(collection = "groups")
@AllArgsConstructor
@NoArgsConstructor
@Data
class Groups {

	@Id
	private String id;
	private String name;
}
*/

