package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Response")
public class Response {

    @Id
    @Column(name = "sessionNumber")
    private long sessionNumber;

    @Column(name = "questionNumber")
    private int questionNumber;

    @Column(name = "studentChoice")
    private String studentChoice;

    public Response(){

    }

    public Response(long sessionNumber, int questionNumber, String studentChoice) {
        this.sessionNumber = sessionNumber;
        this.questionNumber = questionNumber;
        this.studentChoice = studentChoice;
    }

    public long getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(long sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getStudentChoice() {
        return studentChoice;
    }

    public void setStudentChoice(String studentChoice) {
        this.studentChoice = studentChoice;
    }
}
