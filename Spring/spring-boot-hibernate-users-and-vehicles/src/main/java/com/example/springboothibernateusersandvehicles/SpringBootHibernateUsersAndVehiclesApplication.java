package com.example.springboothibernateusersandvehicles;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@AllArgsConstructor
public class SpringBootHibernateUsersAndVehiclesApplication {

	private UsersRepository usersRepository;
	private VehiclesRepository vehiclesRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateUsersAndVehiclesApplication.class, args);
	}

	@PostConstruct
	public void init() {

		Users john = new Users("John");

		usersRepository.save(john);
		vehiclesRepository.save(new Vehicles("Jeep", john));
		vehiclesRepository.save(new Vehicles("Car", john));


		System.out.println("******************************************");

		Users savedJohn = usersRepository.findByName("John");
		Vehicles savedJeep = vehiclesRepository.findByName("Jeep");

		System.out.println(savedJohn.toString());
		System.out.println(savedJeep.toString());
		System.out.println("Jeep User: " + savedJeep.getUser());

		System.out.println("******************************************");
	}


}
