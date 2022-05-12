package com.rakuten.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.model.Student;
import com.rakuten.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public void saveStudent(Student student) {
		repository.save(student);
	}

	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	public Student getStudentById(int id) {
		Optional<Student> optional = repository.findById(id);
		if (optional.isEmpty()) {
			throw new IllegalArgumentException();
		}
		return optional.get();
	}

	public void deleteStudentById(int StudentID) {
		repository.deleteById(StudentID);
	}

	public void updateStudentById(Student student) {
		if (!repository.existsById(student.getStudentID())) {
			throw new IllegalArgumentException();
		}
		repository.save(student);
		System.out.println("updated");
	}

	public void deleteAllStuents() {
		repository.deleteAll();
		
	}
}
