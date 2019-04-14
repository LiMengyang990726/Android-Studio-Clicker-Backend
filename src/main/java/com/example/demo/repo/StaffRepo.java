package com.example.demo.repo;

import com.example.demo.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepo extends JpaRepository<Staff, String> {
    List<Staff> findAllByStaffName(String staffName);

    List<Staff> getByStaffName(String staffName);

    Staff save(Staff staff);
}
