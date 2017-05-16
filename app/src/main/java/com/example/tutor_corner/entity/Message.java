package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Message extends BmobObject{
    private String messageId;
    private String issueUserId;
    private String receiveUserId;
    private String content;
    private String issueDate;

    public Message(String messageId, String issueUserId, String receiveUserId, String content, String issueDate) {
        this.messageId = messageId;
        this.issueUserId = issueUserId;
        this.receiveUserId = receiveUserId;
        this.content = content;
        this.issueDate = issueDate;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getIssueUserId() {
        return issueUserId;
    }

    public String getReceiveUserId() {
        return receiveUserId;
    }

    public String getContent() {
        return content;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setIssueUserId(String issueUserId) {
        this.issueUserId = issueUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
