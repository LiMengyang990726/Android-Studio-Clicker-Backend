package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Response")
public class Response {

    @Column(name = "paperTitle")
    private String paperTitle;

    @Column(name = "questionNumber")
    private int questionNumber;

    @Column(name = "choice")
    private char choice;

    public Response(){

    }

    public Response(String paperTitle, int questionNumber, char choice) {
        this.paperTitle = paperTitle;
        this.questionNumber = questionNumber;
        this.choice = choice;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public char getChoice() {
        return choice;
    }

    public void setChoice(char choice) {
        this.choice = choice;
    }
}
