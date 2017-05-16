package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Attention extends BmobObject{
    private Integer attentionId;
    private Integer userId;
    private Integer attentionedUserId;

    public Attention(String tableName, Integer userId, Integer attentionedUserId) {
        super(tableName);
        this.userId = userId;
        this.attentionedUserId = attentionedUserId;
    }

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAttentionedUserId() {
        return attentionedUserId;
    }

    public void setAttentionedUserId(Integer attentionedUserId) {
        this.attentionedUserId = attentionedUserId;
    }
}
