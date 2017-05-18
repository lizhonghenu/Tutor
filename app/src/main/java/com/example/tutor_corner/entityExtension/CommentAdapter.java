package com.example.tutor_corner.entityExtension;

import com.example.tutor_corner.entity.info;
import com.example.tutor_corner.entity.subject;
import com.example.tutor_corner.entity.user;

import cn.bmob.v3.BmobObject;

/**
 * Created by 李钟 on 2017/5/16.
 */

public class CommentAdapter extends BmobObject {
//    comment 已学课程评论
    private user userId;
    //private Integer commentedUserId;
    private info infoId;
    private String content;
    private Integer attitudeScore;
    private Integer methodScore;
    private Integer abilityScore;
    private String commentIssueDate;
//    user用户信息
    private String commentUserName;
//    info 家教信息
    private subject subjectId;
    private String infoIssueDate;
//    subject课程信息
    private String grade;
    private String subjectName;
    private String startDate;
    private String endDate;
    public CommentAdapter(){

    }
    public CommentAdapter(String commentUserName,user userId,info infoId,String content,Integer attitudeScore
            ,Integer methodScore,Integer abilityScore,String commentIssueDate,subject subjectId,String infoIssueDate,String grade
            ,String subjectName,String startDate,String endDate){
        this.commentUserName = commentUserName;
        this.abilityScore = abilityScore;
        this.attitudeScore = attitudeScore;
        //this.commentedUserId = commentedUserId;
        this.userId = userId;
        this.infoId = infoId;
        this.content = content;
        this.methodScore = methodScore;
        this.endDate = endDate;
        this.commentIssueDate = commentIssueDate;
        this.subjectId = subjectId;
        this.infoIssueDate = infoIssueDate;
        this.grade = grade;
        this.subjectName = subjectName;
        this.startDate = startDate;
    }

    public String getCommentUserName() {
        return commentUserName;
    }

    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName;
    }

    public user getUserId() {
        return userId;
    }

    public void setUserId(user commentUserId) {
        this.userId = commentUserId;
    }

    public info getInfoId() {
        return infoId;
    }

    public void setInfoId(info infoId) {
        this.infoId = infoId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAttitudeScore() {
        return attitudeScore;
    }

    public void setAttitudeScore(Integer attitudeScore) {
        this.attitudeScore = attitudeScore;
    }

    public Integer getMethodScore() {
        return methodScore;
    }

    public void setMethodScore(Integer methodScore) {
        this.methodScore = methodScore;
    }

    public Integer getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(Integer abilityScore) {
        this.abilityScore = abilityScore;
    }

    public String getCommentIssueDate() {
        return commentIssueDate;
    }

    public void setCommentIssueDate(String commentIssueDate) {
        this.commentIssueDate = commentIssueDate;
    }

    public subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(subject subjectId) {
        this.subjectId = subjectId;
    }

    public String getInfoIssueDate() {
        return infoIssueDate;
    }

    public void setInfoIssueDate(String infoIssueDate) {
        this.infoIssueDate = infoIssueDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
