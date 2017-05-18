package com.example.tutor_corner.entity;

/**
 * Created by 李钟 on 2017/5/16.
 */

public class file {
    private Integer fileId;
    private file studyFile;
    private subject subjectId;
    private user userId;
    public file(){

    }
    public file(Integer fileId, file studyFile, subject subjectId, user userId){
        this.fileId = fileId;
        this.studyFile = studyFile;
        this.subjectId = subjectId;
        this.userId = userId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public file getStudyFile() {
        return studyFile;
    }

    public void setStudyFile(file studyFile) {
        this.studyFile = studyFile;
    }

    public subject getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(subject subjectId) {
        this.subjectId = subjectId;
    }

    public user getUserId() {
        return userId;
    }

    public void setUserId(user userId) {
        this.userId = userId;
    }
}
