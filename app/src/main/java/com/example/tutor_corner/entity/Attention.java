package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class attention extends BmobObject{
    private User userId;
    private Integer attentionedUserId;
    public attention(){

    }
    public attention(String tableName, User userId, Integer attentionedUserId) {
        super(tableName);
        this.userId = userId;
        this.attentionedUserId = attentionedUserId;
    }

//    public Integer getAttentionId() {
//        return attentionId;
//    }
//
//    public void setAttentionId(Integer attentionId) {
//        this.attentionId = attentionId;
//    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Integer getAttentionedUserId() {
        return attentionedUserId;
    }

    public void setAttentionedUserId(Integer attentionedUserId) {
        this.attentionedUserId = attentionedUserId;
    }
}
