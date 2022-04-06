package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	List<User> users = new ArrayList<>();
	void save(User user) {
		
		users.add(user);
		System.out.println("save method is called");
		

	}

	public List<User> getAllUsers() {
		return users;
	}
}
