package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Staff")
public class Staff {

    @Column(name = "staffName")
    private String staffName;

    @Column(name = "staffPassword")
    private String staffPassword;

    @Id
    @Column(name = "paperTitle")
    private String paperTitle;

    public Staff(){

    }

    public Staff(String staffName, String staffPassword, String paperTitle) {
        this.staffName = staffName;
        this.staffPassword = staffPassword;
        this.paperTitle = paperTitle;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }
}
