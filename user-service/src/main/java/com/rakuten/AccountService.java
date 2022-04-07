package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	List<Account> users = new ArrayList<>();
	@Autowired
	UserRepository repository;

	Object save(Account account) {
		repository.save(account);

		System.out.println("save method is called");
		return account;

	}

	public List<Account> getAllUsers() {
		return users;
	}

	public List<Account> getUserByAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("age cannot be negative=" + age);
		}
		List<Account> filteredUsers = getAllUsers().stream().filter((user) -> user.getAge() == age)
				.collect(Collectors.toList());
		return filteredUsers;

	}
}
