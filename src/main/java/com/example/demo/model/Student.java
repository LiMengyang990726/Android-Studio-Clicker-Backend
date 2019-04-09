package com.example.demo.model;

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

    @Column(name = "joinedSession")
    private String joinedSession;

    @Column(name = "joinedSessionScore")
    private float joinedSessionScore;

    public Student(){

    }

    public Student(String studentName, String studentPassword, String joinedSession, float joinedSessionScore) {
        this.studentName = studentName;
        this.studentPassword = studentPassword;
        this.joinedSession = joinedSession;
        this.joinedSessionScore = joinedSessionScore;
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

    public String getJoinedSession() {
        return joinedSession;
    }

    public void setJoinedSession(String joinedSession) {
        this.joinedSession = joinedSession;
    }

    public float getJoinedSessionScore() {
        return joinedSessionScore;
    }

    public void setJoinedSessionScore(float joinedSessionScore) {
        this.joinedSessionScore = joinedSessionScore;
    }
}
