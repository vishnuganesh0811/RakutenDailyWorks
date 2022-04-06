package com.rakuten;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	List<User> users = new ArrayList<>();

	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		users.add(user);
	}

	@GetMapping
	List<User> getUsers() {
		return users;
	}

	@GetMapping("{name}")
	User getUserFromName(@PathVariable String name) {
		System.out.println(name);
		
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getName().equals(name)) {
				return users.get(i);
			}
		}
		
		return null;
	}
	
	@GetMapping("age/{age}")
	List<User> getUserFromAge(@PathVariable int age) {
		System.out.println(age);
		 List<User> filteredUsers = users.stream().filter((user)->user.getAge() == age).collect(Collectors.toList());
		 return filteredUsers;
		
	}

}
