package com.example.demo.service;

import com.example.demo.model.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> getAllStaff(String staffName);

    boolean checkPassword(String staffName, String staffPassword);

    String[] getAllPaperTitle(String staffName);

    Staff saveNewPaper(Staff staff);
}
