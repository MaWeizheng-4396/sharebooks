package com.mwz.demo.sharebooks.entity;

public class Reply {
    String id;
    String replyStatus;
    String rep_usersid;
    String rep_id;
    String com_datatime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(String replyStatus) {
        this.replyStatus = replyStatus;
    }

    public String getRep_usersid() {
        return rep_usersid;
    }

    public void setRep_usersid(String rep_usersid) {
        this.rep_usersid = rep_usersid;
    }

    public String getRep_id() {
        return rep_id;
    }

    public void setRep_id(String rep_id) {
        this.rep_id = rep_id;
    }

    public String getCom_datatime() {
        return com_datatime;
    }

    public void setCom_datatime(String com_datatime) {
        this.com_datatime = com_datatime;
    }

    public Reply(String id, String replyStatus, String rep_usersid, String rep_id, String com_datatime) {
        this.id = id;
        this.replyStatus = replyStatus;
        this.rep_usersid = rep_usersid;
        this.rep_id = rep_id;
        this.com_datatime = com_datatime;
    }

    public Reply() {
    }
}
