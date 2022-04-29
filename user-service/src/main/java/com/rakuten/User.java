package com.rakuten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity 
@Table(name = "users") 
public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id; 
	
	@NotBlank 
	String name;
	
	@Min(value=1, message="Age cannogt be less than one year")
	@Max(value=100, message="Unreasonable age")
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}