package com.example.demo.model;

import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "studentName")
    private String studentName;

    @Column(name = "studentPassword")
    private String studentPassword;

    @Column(name = "savedQuestionBody")
    private String savedQuestionBody;

    @Column(name = "savedQuestionAnswer")
    private String savedQuestionAnswer;

    public Student(){

    }

    public Student(String studentName, String studentPassword, String savedQuestionBody, String savedQuestionAnswer) {
        this.studentName = studentName;
        this.studentPassword = studentPassword;
        this.savedQuestionBody = savedQuestionBody;
        this.savedQuestionAnswer = savedQuestionAnswer;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getSavedQuestionBody() {
        return savedQuestionBody;
    }

    public void setSavedQuestionBody(String savedQuestionBody) {
        this.savedQuestionBody = savedQuestionBody;
    }

    public String getSavedQuestionAnswer() {
        return savedQuestionAnswer;
    }

    public void setSavedQuestionAnswer(String savedQuestionAnswer) {
        this.savedQuestionAnswer = savedQuestionAnswer;
    }
}
