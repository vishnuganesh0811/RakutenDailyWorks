package com.rakuten.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum CATEGORY {
	LIFTING,RUNNING,CYCLING,YOGA,EXERCISE
}

@Entity
public class Workout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer workOutId;
	private String workOutTitle;
	private String WorkOutNote;
	private float caloriesBurntPerMinute;
	
	@Enumerated(EnumType.STRING)
	private CATEGORY category;

	public Integer getWorkOutId() {
		return workOutId;
	}

	public void setWorkOutId(Integer workOutId) {
		this.workOutId = workOutId;
	}

	public String getWorkOutTitle() {
		return workOutTitle;
	}

	public void setWorkOutTitle(String workOutTitle) {
		this.workOutTitle = workOutTitle;
	}

	public String getWorkOutNote() {
		return WorkOutNote;
	}

	public void setWorkOutNote(String workOutNote) {
		WorkOutNote = workOutNote;
	}

	public float getCaloriesBurntPerMinute() {
		return caloriesBurntPerMinute;
	}

	public void setCaloriesBurntPerMinute(float caloriesBurntPerMinute) {
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
	}

	public CATEGORY getCategory() {
		return category;
	}

	public void setCategory(CATEGORY category) {
		this.category = category;
	}
	
	
	
}
