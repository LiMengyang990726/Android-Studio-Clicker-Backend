package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Session")
public class Session {
    @Id
    @Column(name = "sessionNumber")
    private long sessionNumber;

    @Column(name = "paperTitle")
    private String paperTitle;



    public Session(){

    }

    public Session(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public long getSessionNumber() {
        return sessionNumber;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

}
