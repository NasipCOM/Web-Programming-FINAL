package org.sambasoft.controllers;

import org.sambasoft.entities.User;
import org.sambasoft.services.TaskService;
import org.sambasoft.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ProfileController {
	
	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/profile")
	public String showProfilePage(Model model, Principal principal) {

		String email = principal.getName();
		User user = userService.findOne(email);

		model.addAttribute("tasks", taskService.findUserTask(user));


		return "views/profile";
	}

}
