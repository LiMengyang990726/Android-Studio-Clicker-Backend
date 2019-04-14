package com.example.demo.controller;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    // use for checking
    @GetMapping("/")
    public List<Staff> getAll(
            @RequestParam String staffName
    ){
        return staffService.getAllStaff(staffName);
    }

    // use for logging in page
    @GetMapping("/checkpassword")
    public boolean checkPassword(
            @RequestParam String staffName,
            @RequestParam String staffPassword
    ){
        return staffService.checkPassword(staffName,staffPassword);
    }

    // use for starting quiz activity
    @GetMapping("/papers")
    public String[] getAllPapers(
          @RequestParam String staffName
    ){
        return staffService.getAllPaperTitle(staffName);
    }

    // use for creating paper activity
    @PostMapping("/createpaper")
    public Staff addPaper(
            @Valid @RequestBody Staff staff
    ){
        return staffService.saveNewPaper(staff);
    }
}
