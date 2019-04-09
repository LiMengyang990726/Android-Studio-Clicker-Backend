package com.example.demo.service;

import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

public interface StudentService {

    boolean checkPassword(String studentName, String studentPassword);


}
