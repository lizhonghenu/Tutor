package com.example.tutor_corner.entityExtension;

import android.support.v4.app.INotificationSideChannel;

import cn.bmob.v3.BmobObject;

/**
 * Created by 李钟 on 2017/5/16.
 */

public class CommentAdapter extends BmobObject {
//    comment 已学课程评论
    private Integer commentUserId;
    private Integer commentedUserId;
    private Integer infoId;
    private String content;
    private Integer attitudeScore;
    private Integer methodScore;
    private Integer abilityScore;
    private String commentIssueDate;
//    info 家教信息
    private Integer subjectId;
    private String infoIssueDate;
//    subject课程信息
    private String grade;
    private String subjectName;
    private String startDate;
    private String endDate;
    public CommentAdapter(Integer commentUserId,Integer commentedUserId,Integer infoId,String content,Integer attitudeScore
    ,Integer methodScore,Integer abilityScore,String commentIssueDate,Integer subjectId,String infoIssueDate,String grade
    ,String subjectName,String startDate,String endDate){
        this.abilityScore = abilityScore;
        this.attitudeScore = attitudeScore;
        this.commentedUserId = commentedUserId;
        this.commentUserId = commentUserId;
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

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Integer getCommentedUserId() {
        return commentedUserId;
    }

    public void setCommentedUserId(Integer commentedUserId) {
        this.commentedUserId = commentedUserId;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
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
