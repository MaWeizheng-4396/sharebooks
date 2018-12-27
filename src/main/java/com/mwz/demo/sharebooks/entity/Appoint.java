package com.mwz.demo.sharebooks.entity;

public class Appoint {

    String idappoint;
    String appointuname;
    String imgId;
    String userId;
    String appointTime;
    String timelimet;
    String deterTime;
    String status;

    public Appoint() {
    }

    public Appoint(String idappoint, String appointuname, String imgId, String userId, String appointTime, String timelimet, String deterTime, String status) {
        this.idappoint = idappoint;
        this.appointuname = appointuname;
        this.imgId = imgId;
        this.userId = userId;
        this.appointTime = appointTime;
        this.timelimet = timelimet;
        this.deterTime = deterTime;
        this.status = status;
    }

    public String getIdappoint() {
        return idappoint;
    }

    public void setIdappoint(String idappoint) {
        this.idappoint = idappoint;
    }

    public String getAppointuname() {
        return appointuname;
    }

    public void setAppointuname(String appointuname) {
        this.appointuname = appointuname;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }

    public String getTimelimet() {
        return timelimet;
    }

    public void setTimelimet(String timelimet) {
        this.timelimet = timelimet;
    }

    public String getDeterTime() {
        return deterTime;
    }

    public void setDeterTime(String deterTime) {
        this.deterTime = deterTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
