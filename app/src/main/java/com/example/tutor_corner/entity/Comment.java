package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Comment extends BmobObject {
    private String commentId;
    private String commentUserId;
    private String commentedUserId;
    private String infoId;
    private String content;
    private Integer attitudeScore;//满分是10分
    private Integer methodScore;
    private Integer abilityScore;
    private String issueDate;

    public Comment(String commentUserId, String commentedUserId, String infoId, String content, Integer attitudeScore, Integer methodScore, Integer abilityScore, String issueDate) {
        this.commentUserId = commentUserId;
        this.commentedUserId = commentedUserId;
        this.infoId = infoId;
        this.content = content;
        this.attitudeScore = attitudeScore;
        this.methodScore = methodScore;
        this.abilityScore = abilityScore;
        this.issueDate = issueDate;
    }

    public String getCommentId() {
        return commentId;
    }

    public String getCommentUserId() {
        return commentUserId;
    }

    public String getCommentedUserId() {
        return commentedUserId;
    }

    public String getInfoId() {
        return infoId;
    }

    public String getContent() {
        return content;
    }

    public Integer getAttitudeScore() {
        return attitudeScore;
    }

    public Integer getMethodScore() {
        return methodScore;
    }

    public Integer getAbilityScore() {
        return abilityScore;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId;
    }

    public void setCommentedUserId(String commentedUserId) {
        this.commentedUserId = commentedUserId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAttitudeScore(Integer attitudeScore) {
        this.attitudeScore = attitudeScore;
    }

    public void setMethodScore(Integer methodScore) {
        this.methodScore = methodScore;
    }

    public void setAbilityScore(Integer abilityScore) {
        this.abilityScore = abilityScore;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
