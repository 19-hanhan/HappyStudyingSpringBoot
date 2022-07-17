package cn.edu.jxnu.admin.entity;

import java.util.Date;

public class Request {
    private Integer tId;
    private String tActivityId;
    private Date tRequestTime;
    private String tWhy;

    public Request() {
    }
    public Request(String tActivityId, Date tRequestTime, String tWhy) {
        this.tActivityId = tActivityId;
        this.tRequestTime = tRequestTime;
        this.tWhy = tWhy;
    }

    @Override
    public String toString() {
        return "Request{" +
                "tId=" + tId +
                ", tActivityId='" + tActivityId + '\'' +
                ", tRequestTime=" + tRequestTime +
                ", tWhy='" + tWhy + '\'' +
                '}';
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettActivityId() {
        return tActivityId;
    }

    public void settActivityId(String tActivityId) {
        this.tActivityId = tActivityId;
    }

    public Date gettRequestTime() {
        return tRequestTime;
    }

    public void settRequestTime(Date tRequestTime) {
        this.tRequestTime = tRequestTime;
    }

    public String gettWhy() {
        return tWhy;
    }

    public void settWhy(String tWhy) {
        this.tWhy = tWhy;
    }
}
