package cn.edu.jxnu.admin.entity;

import java.util.Date;

public class Activity {
    private Integer aId;
    private String aUserId;
    private String aUserName;
    private Date aPublishTime;
    private Date aBeginTime;
    private Date aEndTime;
    private Integer aViewNumber;
    private Integer aResponsesNumber;
    private String aTitle;
    private String aIcon;
    private String aDescription;
    private String aColleges;
    private String aGradeLevel;
    private Integer isSticky;
    private Integer isEssence;
    private Integer isAudit;

    public Activity() { }

    public Activity(Integer aId, String aUserName, String aTitle, String aColleges, Integer isSticky, Integer isEssence) {
        this.aId = aId;
        this.aUserName = aUserName;
        this.aTitle = aTitle;
        this.aColleges = aColleges;
        this.isSticky = isSticky;
        this.isEssence = isEssence;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "aId=" + aId +
                ", aUserId='" + aUserId + '\'' +
                ", aUserName='" + aUserName + '\'' +
                ", aPublishTime=" + aPublishTime +
                ", aBeginTime=" + aBeginTime +
                ", aEndTime=" + aEndTime +
                ", aViewNumber=" + aViewNumber +
                ", aResponsesNumber=" + aResponsesNumber +
                ", aTitle='" + aTitle + '\'' +
                ", aIcon='" + aIcon + '\'' +
                ", aDescription='" + aDescription + '\'' +
                ", aColleges='" + aColleges + '\'' +
                ", aGradeLevel='" + aGradeLevel + '\'' +
                ", isSticky=" + isSticky +
                ", isEssence=" + isEssence +
                ", isAudit=" + isAudit +
                '}';
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaUserId() {
        return aUserId;
    }

    public void setaUserId(String aUserId) {
        this.aUserId = aUserId;
    }

    public String getaUserName() {
        return aUserName;
    }

    public void setaUserName(String aUserName) {
        this.aUserName = aUserName;
    }

    public Date getaPublishTime() {
        return aPublishTime;
    }

    public void setaPublishTime(Date aPublishTime) {
        this.aPublishTime = aPublishTime;
    }

    public Date getaBeginTime() {
        return aBeginTime;
    }

    public void setaBeginTime(Date aBeginTime) {
        this.aBeginTime = aBeginTime;
    }

    public Date getaEndTime() {
        return aEndTime;
    }

    public void setaEndTime(Date aEndTime) {
        this.aEndTime = aEndTime;
    }

    public Integer getaViewNumber() {
        return aViewNumber;
    }

    public void setaViewNumber(Integer aViewNumber) {
        this.aViewNumber = aViewNumber;
    }

    public Integer getaResponsesNumber() {
        return aResponsesNumber;
    }

    public void setaResponsesNumber(Integer aResponsesNumber) {
        this.aResponsesNumber = aResponsesNumber;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle;
    }

    public String getaIcon() {
        return aIcon;
    }

    public void setaIcon(String aIcon) {
        this.aIcon = aIcon;
    }

    public String getaDescription() {
        return aDescription;
    }

    public void setaDescription(String aDescription) {
        this.aDescription = aDescription;
    }

    public String getaColleges() {
        return aColleges;
    }

    public void setaColleges(String aColleges) {
        this.aColleges = aColleges;
    }

    public String getaGradeLevel() {
        return aGradeLevel;
    }

    public void setaGradeLevel(String aGradeLevel) {
        this.aGradeLevel = aGradeLevel;
    }

    public Integer getIsSticky() {
        return isSticky;
    }

    public void setIsSticky(Integer isSticky) {
        this.isSticky = isSticky;
    }

    public Integer getIsEssence() {
        return isEssence;
    }

    public void setIsEssence(Integer isEssence) {
        this.isEssence = isEssence;
    }

    public Integer getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(Integer isAudit) {
        this.isAudit = isAudit;
    }
}
