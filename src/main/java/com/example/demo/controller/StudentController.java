package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // use for logging in page
    @GetMapping("/checkpassword")
    public boolean checkPassword(
            @RequestParam String studentName,
            @RequestParam String studentPassword
    ){
        return studentService.checkPassword(studentName,studentPassword);
    }

//    // use for pulling out the saved question
//    @GetMapping("/savedquestion")
//    public String[] getQuestion(
//            @RequestParam String studentName
//    ){
//        String[] savedQuestionAnswers = studentService.getAllSavedQuestionAnswer(studentName);
//        String[] savedQuestionBodies = studentService.getAllSavedQuestionBody(studentName);
//        return savedQuestionAnswers;
//    }
}
