package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		
		return service.save(user);
	}

	@GetMapping
	List<User> getUsers() {
		return service.getAllUsers();
	}
	
//	@GetMapping("/name/{name}")
//	User getUserFromName(@PathVariable String name) {
//
//		if (name.isBlank() || name.isEmpty()) {
//			throw new IllegalArgumentException("Name cannot be empty");
//		}
//
//		for (int i = 0; i < users.size(); i++) {
//			if (users.get(i).getName().equals(name)) {
//				return users.get(i);
//			}
//		}
//
//		return null;
//	}
//
	@GetMapping("/age/{age}") // localhost:8081/user/age/20
	List<User> getUsersByage(@PathVariable int age) {

		List<User> filteredUsers = service.getUserByAge(age);
		return filteredUsers;
	}
}