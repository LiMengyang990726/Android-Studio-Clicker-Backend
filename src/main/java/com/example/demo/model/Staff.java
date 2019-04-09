package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Staff")
public class Staff {

    @Id
    @Column(name = "staffName")
    private String staffName;

    @Column(name = "paperTitle")
    private String paperTitle;

    public Staff(){

    }

    public Staff(String staffName, String paperTitle) {
        this.staffName = staffName;
        this.paperTitle = paperTitle;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }
}
