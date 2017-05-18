package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class message extends BmobObject{
    private Integer issueUserId;
    private Integer receiveUserId;
    private String content;
    private String issueDate;
    public message(){

    }
    public message(Integer issueUserId, Integer receiveUserId, String content, String issueDate) {
        this.issueUserId = issueUserId;
        this.receiveUserId = receiveUserId;
        this.content = content;
        this.issueDate = issueDate;
    }

//    public Integer getMessageId() {
//        return messageId;
//    }
//
//    public void setMessageId(Integer messageId) {
//        this.messageId = messageId;
//    }

    public Integer getIssueUserId() {
        return issueUserId;
    }

    public void setIssueUserId(Integer issueUserId) {
        this.issueUserId = issueUserId;
    }

    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
