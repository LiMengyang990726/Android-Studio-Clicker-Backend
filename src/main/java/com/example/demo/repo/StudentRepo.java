package com.example.demo.repo;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, String> {

    List<Student> getByStudentName(String studentName);

}
