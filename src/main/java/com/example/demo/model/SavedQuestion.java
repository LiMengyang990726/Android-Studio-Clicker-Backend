package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "SavedQuestion")
public class SavedQuestion {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "questionBody")
    private String quesetionBody;

    @Column(name = "questionAnswer")
    private String questionAnswer;

    @Column(name = "myAnswer")
    private String myAnswer;

    public SavedQuestion(String quesetionBody, String questionAnswer, String myAnswer) {
        this.quesetionBody = quesetionBody;
        this.questionAnswer = questionAnswer;
        this.myAnswer = myAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuesetionBody() {
        return quesetionBody;
    }

    public void setQuesetionBody(String quesetionBody) {
        this.quesetionBody = quesetionBody;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getMyAnswer() {
        return myAnswer;
    }

    public void setMyAnswer(String myAnswer) {
        this.myAnswer = myAnswer;
    }
}
