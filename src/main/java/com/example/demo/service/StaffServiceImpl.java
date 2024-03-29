package com.example.demo.service;

import com.example.demo.model.Staff;
import com.example.demo.repo.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    StaffRepo staffRepo;

    @Override
    public List<Staff> getAllStaff(String staffName){
        return staffRepo.findAllByStaffName(staffName);
    }

    @Override
    public boolean checkPassword(String staffName, String staffPassword){
        String actualStaffPassword = staffRepo.getByStaffName(staffName).get(0).getStaffPassword();
        return (staffPassword.equals(actualStaffPassword));
    }

    @Override
    public String[] getAllPaperTitle(String staffName){
        List<Staff> staffs = staffRepo.getByStaffName(staffName);
        String[] paperTitles = new String[staffs.size()];
        for(int i = 0; i < staffs.size(); i++){
            paperTitles[i] = staffs.get(i).getPaperTitle();
            System.out.println(paperTitles[i]);
        }
        return paperTitles;
    }

    @Override
    public Staff saveNewPaper(Staff staff){
        return staffRepo.save(staff);
    }
}
