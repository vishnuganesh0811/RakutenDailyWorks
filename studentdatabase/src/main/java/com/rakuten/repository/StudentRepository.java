package com.rakuten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
