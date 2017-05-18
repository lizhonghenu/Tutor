package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class info extends BmobObject {
    private info infoId;
    private boolean type;//true表示别人发布的家教信息，false表示求家教信息。
    private user userId;
    private subject subjectId;
    private String issueDate;
    private String remark;//备注
    public info(){

    }
    public info(String tableName, boolean type, user userId, subject subjectId, String issueDate, String remark) {
        super(tableName);
        this.type = type;
        this.userId = userId;
        this.subjectId = subjectId;
        this.issueDate = issueDate;
        this.remark = remark;
    }

    public info getInfoId() {
        return infoId;
    }

    public void setInfoId(info infoId) {
        this.infoId = infoId;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public user getUserId() {
        return userId;
    }

    public void setUserId(Integer issueUserId) {
        this.userId = userId;
    }

    public subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(subject subjectId) {
        this.subjectId = subjectId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
