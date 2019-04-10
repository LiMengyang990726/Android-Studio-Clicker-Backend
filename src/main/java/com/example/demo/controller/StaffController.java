package com.example.demo.controller;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    // use for logging in page
    @GetMapping("/")
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
    @PutMapping("/createpaper")
    public Staff addPaper(
            @Valid @RequestBody String staffName,
            @Valid @RequestBody String staffPassword,
            @Valid @RequestBody String paperTitle
    ){
        return staffService.saveNewPaper(staffName,staffPassword,paperTitle);
    }
}
