package com.example.tutor_corner.entity;

import cn.bmob.v3.BmobObject;

/**
 * Created by 青 on 2017/5/15.
 */

public class Info extends BmobObject {
    private Integer infoId;
    private boolean type;//true表示别人发布的家教信息，false表示求家教信息。
    private Integer issueUserId;
    private Integer subjectId;
    private String issueDate;
    private String remark;//备注

    public Info(String tableName, boolean type, Integer issueUserId, Integer subjectId, String issueDate, String remark) {
        super(tableName);
        this.type = type;
        this.issueUserId = issueUserId;
        this.subjectId = subjectId;
        this.issueDate = issueDate;
        this.remark = remark;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Integer getIssueUserId() {
        return issueUserId;
    }

    public void setIssueUserId(Integer issueUserId) {
        this.issueUserId = issueUserId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
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
