package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class comment extends BmobObject {
    private User userId,commentedUserId;
    private info infoId;
    private subject subjectId;
    private String content;
    private Integer attitudeScore;//满分是10分
    private Integer methodScore;
    private Integer abilityScore;
    private String issueDate;
    public comment(){

    }
    public comment(User commentedUserId,User userId, info infoId, String content, Integer attitudeScore, Integer methodScore, Integer abilityScore, String issueDate,subject subjectId) {
        this.userId = userId;
        this.commentedUserId = commentedUserId;
        this.infoId = infoId;
        this.content = content;
        this.attitudeScore = attitudeScore;
        this.methodScore = methodScore;
        this.abilityScore = abilityScore;
        this.issueDate = issueDate;
        this.subjectId = subjectId;
    }

    public subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(subject subjectId) {
        this.subjectId = subjectId;
    }

    public User getCommentedUserId() {
        return commentedUserId;
    }

    public void setCommentedUserId(User commentedUserId) {
        this.commentedUserId = commentedUserId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
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

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String commentIssueDate) {
        this.issueDate = issueDate;
    }
}
