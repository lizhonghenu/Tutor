package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Subject extends BmobObject {
    private String subjectId;
    private String grade;
    private String subjectName;
    private String startDate;
    private String endDate;
    private String time;

    public Subject(String tableName, String grade, String subjectName, String startDate, String endDate, String time) {
        super(tableName);
        this.grade = grade;
        this.subjectName = subjectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.time = time;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getGrade() {
        return grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getTime() {
        return time;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
