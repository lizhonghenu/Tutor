package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class User  extends BmobObject {
    private String userId;
    private String name;
    private String gender;
    private String birthYearMonth;
    private String phone;
    private String education;
    private String city;
    private String street;
    private String registDate;
    private String pic;//图片如何存放
    private String email;
    private boolean isLogin;//是否登录

    public User(String tableName, String name, String gender, String birthYearMonth, String phone, String education, String city, String street, String registDate, String pic, String email, boolean isLogin) {
        super(tableName);
        this.name = name;
        this.gender = gender;
        this.birthYearMonth = birthYearMonth;
        this.phone = phone;
        this.education = education;
        this.city = city;
        this.street = street;
        this.registDate = registDate;
        this.pic = pic;
        this.email = email;
        this.isLogin = isLogin;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthYearMonth(String birthYearMonth) {
        this.birthYearMonth = birthYearMonth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthYearMonth() {
        return birthYearMonth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEducation() {
        return education;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getRegistDate() {
        return registDate;
    }

    public String getPic() {
        return pic;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLogin() {
        return isLogin;
    }
}
