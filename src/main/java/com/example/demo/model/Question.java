package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "paperTitle")
    private String paperTitle;

    @Column(name = "questionNumber")
    private int questionNumber;

    @Column(name = "questionBody")
    private String questionBody;

    @Column(name = "questionAnswerA")
    private String questionAnswerA;

    @Column(name = "questionAnswerB")
    private String questionAnswerB;

    @Column(name = "questionAnswerC")
    private String questionAnswerC;

    @Column(name = "questionAnswerD")
    private String questionAnswerD;

    @Column(name = "questionAnswer")
    private String questionAnswer;

    public Question(){

    }

    public Question(String paperTitle, int questionNumber, String questionBody, String questionAnswerA, String questionAnswerB, String questionAnswerC, String questionAnswerD, String questionAnswer) {
        this.paperTitle = paperTitle;
        this.questionNumber = questionNumber;
        this.questionBody = questionBody;
        this.questionAnswerA = questionAnswerA;
        this.questionAnswerB = questionAnswerB;
        this.questionAnswerC = questionAnswerC;
        this.questionAnswerD = questionAnswerD;
        this.questionAnswer = questionAnswer;
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

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public String getQuestionAnswerA() {
        return questionAnswerA;
    }

    public void setQuestionAnswerA(String questionAnswerA) {
        this.questionAnswerA = questionAnswerA;
    }

    public String getQuestionAnswerB() {
        return questionAnswerB;
    }

    public void setQuestionAnswerB(String questionAnswerB) {
        this.questionAnswerB = questionAnswerB;
    }

    public String getQuestionAnswerC() {
        return questionAnswerC;
    }

    public void setQuestionAnswerC(String questionAnswerC) {
        this.questionAnswerC = questionAnswerC;
    }

    public String getQuestionAnswerD() {
        return questionAnswerD;
    }

    public void setQuestionAnswerD(String questionAnswerD) {
        this.questionAnswerD = questionAnswerD;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
}
