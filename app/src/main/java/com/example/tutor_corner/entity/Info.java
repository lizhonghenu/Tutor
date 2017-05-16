package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Info extends BmobObject {
    private String infoId;
    private boolean type;//true表示别人发布的家教信息，false表示求家教信息。
    private String issueUserId;
    private String subjectId;
    private String issueDate;
    private String remark;//备注

    public Info(String tableName, boolean type, String issueUserId, String subjectId, String issueDate, String remark) {
        super(tableName);
        this.type = type;
        this.issueUserId = issueUserId;
        this.subjectId = subjectId;
        this.issueDate = issueDate;
        this.remark = remark;
    }

    public String getInfoId() {
        return infoId;
    }

    public boolean isType() {
        return type;
    }

    public String getIssueUserId() {
        return issueUserId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public void setIssueUserId(String issueUserId) {
        this.issueUserId = issueUserId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
