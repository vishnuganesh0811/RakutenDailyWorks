package com.rakuten.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Workout;
import com.rakuten.services.WorkoutService;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
	
	@Autowired
	WorkoutService service;
	
	@PostMapping
	void postWorkout(@RequestBody Workout workout) {
		System.out.println(workout.getWorkOutTitle());
		service.saveWorkout(workout);
	}
	
	@GetMapping
	List<Workout> getWorkouts() {
		return service.getAllWorkouts();
	}
	
	@GetMapping("/id")
	Workout getWorkoutById(@RequestParam int workOutID) {
		System.out.println(workOutID);
		return service.getWorkoutById(workOutID);
	}
	
	@DeleteMapping("/delete")
	void deleteWorkout(@RequestParam int workOutId) {
		service.deleteWorkoutById(workOutId);
	}
	
	@PutMapping("/update")
	void updateWorkout(@RequestBody Workout workout) {
		service.updateWorkoutById(workout);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleNotFound() {}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleIdNotFound() {}


	
}
