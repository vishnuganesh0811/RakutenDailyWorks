package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	List<User> users = new ArrayList<>();
	@Autowired
	UserRepository repository;

	Object save(User user) {
		repository.save(user);
		
		System.out.println("save method is called");
		return user;
		

	}

	public List<User> getAllUsers() {
		return users;
	}
	public List<User> getUserByAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("age cannot be negative=" + age);
		}
		List<User> filteredUsers = getAllUsers().stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
		return filteredUsers;

	}
}
