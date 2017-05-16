package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Attention extends BmobObject{
    private String attentionId;
    private String userId;
    private String attentionedUserId;

    public Attention(String tableName, String userId, String attentionedUserId) {
        super(tableName);
        this.userId = userId;
        this.attentionedUserId = attentionedUserId;
    }

    public String getUserId() {
        return userId;
    }

    public String getAttentionedUserId() {
        return attentionedUserId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAttentionedUserId(String attentionedUserId) {
        this.attentionedUserId = attentionedUserId;
    }
}
