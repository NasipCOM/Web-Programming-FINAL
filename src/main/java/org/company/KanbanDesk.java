package org.company;

import org.company.entities.User;
import org.company.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KanbanDesk implements  CommandLineRunner{
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(KanbanDesk.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		{
			User newAdmin = new User("admin@mail.com", "Admin", "12345");
			userService.createAdmin(newAdmin);
		}
	}
}
