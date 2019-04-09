package com.example.demo.repo;

import com.example.demo.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff, String> {

}
