package com.example.demo.service;

import com.example.demo.model.Staff;

public interface StaffService {
    boolean checkPassword(String staffName, String staffPassword);

    String[] getAllPaperTitle(String staffName);

    Staff saveNewPaper(String staffName, String staffPassword, String paperTitle);
}
