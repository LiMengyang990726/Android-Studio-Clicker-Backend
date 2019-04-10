package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public boolean checkPassword(String studentName, String studentPassword){
        String actualStudentPassword = studentRepo.getByStudentName(studentName).get(0).getStudentPassword();
        return studentPassword.equals(actualStudentPassword);
    }

    @Override
    public String[] getAllSavedQuestionBody(String studentName){
        List<Student> students = studentRepo.getByStudentName(studentName);
        String[] questionBodies = new String[students.size()];
        for(int i = 0; i < students.size();i++){
            questionBodies[i] = students.get(i).getSavedQuestionBody();
        }
        return questionBodies;
    }

    @Override
    public String[] getAllSavedQuestionAnswer(String studentName){
        List<Student> students = studentRepo.getByStudentName(studentName);
        String[] questionAnswers = new String[students.size()];
        for(int i = 0; i < students.size();i++){
            questionAnswers[i] = students.get(i).getSavedQuestionAnswer();
        }
        return questionAnswers;
    }
}
