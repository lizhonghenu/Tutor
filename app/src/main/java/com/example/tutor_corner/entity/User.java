package com.example.tutor_corner.entity;

import java.io.File;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class user  extends BmobObject {
    private user userId;
    private String username;
    private String password;
    private String sex;
    private String birthday;
    private String mobilephoneNumber;
    private String education;
    private String area;
    private Integer age;
    private String school;
    private String profession;//职业
    private String registDate;
    private File pic;//图片如何存放
    private String email;
    private boolean isLog;//是否登录

    public user(String tableName, String username, String password, String sex, String birthday, String mobilephoneNumber, String education, String area, Integer age, String school, String profession, String registDate, File pic, String email, boolean isLog) {
        super(tableName);
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.mobilephoneNumber = mobilephoneNumber;
        this.education = education;
        this.area = area;
        this.age = age;
        this.school = school;
        this.profession = profession;
        this.registDate = registDate;
        this.pic = pic;
        this.email = email;
        this.isLog = isLog;
    }

    public user getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getMobilephoneNumber() {
        return mobilephoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public String getArea() {
        return area;
    }

    public Integer getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public String getProfession() {
        return profession;
    }

    public String getRegistDate() {
        return registDate;
    }

    public File getPic() {
        return pic;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLog() {
        return isLog;
    }

    public void setUserId(user userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setMobilephoneNumber(String mobilephoneNumber) {
        this.mobilephoneNumber = mobilephoneNumber;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLog(boolean log) {
        isLog = log;
    }
}