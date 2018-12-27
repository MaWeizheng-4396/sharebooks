package com.mwz.demo.sharebooks.entity;

public class Commonts {

    String id;
    String com_status;
    String com_userid;
    String com_speciesid;
    String com_datatime;

    public Commonts(String id, String com_status, String com_userid, String com_speciesid, String com_datatime) {
        this.id = id;
        this.com_status = com_status;
        this.com_userid = com_userid;
        this.com_speciesid = com_speciesid;
        this.com_datatime = com_datatime;
    }

    public Commonts() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCom_status() {
        return com_status;
    }

    public void setCom_status(String com_status) {
        this.com_status = com_status;
    }

    public String getCom_userid() {
        return com_userid;
    }

    public void setCom_userid(String com_userid) {
        this.com_userid = com_userid;
    }

    public String getCom_speciesid() {
        return com_speciesid;
    }

    public void setCom_speciesid(String com_speciesid) {
        this.com_speciesid = com_speciesid;
    }

    public String getCom_datatime() {
        return com_datatime;
    }

    public void setCom_datatime(String com_datatime) {
        this.com_datatime = com_datatime;
    }
}
