package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Comment extends BmobObject {
    private Integer commentId;
    private Integer commentUserId;
    private Integer commentedUserId;
    private Integer infoId;
    private String content;
    private Integer attitudeScore;//满分是10分
    private Integer methodScore;
    private Integer abilityScore;
    private String issueDate;

    public Comment(Integer commentUserId, Integer commentedUserId, Integer infoId, String content, Integer attitudeScore, Integer methodScore, Integer abilityScore, String issueDate) {
        this.commentUserId = commentUserId;
        this.commentedUserId = commentedUserId;
        this.infoId = infoId;
        this.content = content;
        this.attitudeScore = attitudeScore;
        this.methodScore = methodScore;
        this.abilityScore = abilityScore;
        this.issueDate = issueDate;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
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

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
