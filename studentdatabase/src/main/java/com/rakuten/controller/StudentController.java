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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Student;
import com.rakuten.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping
	void postStudent(@RequestBody Student student) {
		System.out.println(student.getSchoolName());
		service.saveStudent(student);
	}

	@GetMapping
	List<Student> getStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/id")
	Student getStudentById(@RequestParam int studentId) {
		System.out.println(studentId);
		return service.getStudentById(studentId);
	}

	@DeleteMapping("/delete")
	void deleteStudent(@RequestParam int studentId) {
		service.deleteStudentById(studentId);
	}
	@DeleteMapping("/deleteall")
	void deleteAllStudent() {
		service.deleteAllStuents();
	}

	@PutMapping("/update")
	void updateStudent(@RequestBody Student student) {
		service.updateStudentById(student);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleNotFound() {
	}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleIdNotFound() {
	}

}
