package com.example.tutor_corner.entity;

/**
 * Created by 李钟 on 2017/5/16.
 */

public class File {
    private Integer fileId;
    private File studyFile;
    private Integer subjectId;
    private Integer userId;
    public File(Integer fileId,File studyFile,Integer subjectId,Integer userId){
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

    public File getStudyFile() {
        return studyFile;
    }

    public void setStudyFile(File studyFile) {
        this.studyFile = studyFile;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
