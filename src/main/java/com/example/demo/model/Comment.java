package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @Column(name = "comment")
    private String comment;

    @Column(name = "staffName")
    private String staffName;

    public Comment(){

    }

    public Comment(String comment, String staffName) {
        this.comment = comment;
        this.staffName = staffName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
}
