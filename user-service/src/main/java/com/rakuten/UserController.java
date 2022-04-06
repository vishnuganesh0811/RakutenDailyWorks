package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	

	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		
		service.save(user);
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
//	@GetMapping("age/{age}")
//	List<User> getUserFromAge(@PathVariable int age) {
//		if (age < 0) {
//			throw new IllegalArgumentException("Age cannot be negative " + age);
//		}
//		List<User> filteredUsers = users.stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
//		return filteredUsers;

//	}
}