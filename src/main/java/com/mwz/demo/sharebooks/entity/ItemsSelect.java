package com.mwz.demo.sharebooks.entity;

public class ItemsSelect {

    String iditems;
    String itemsname;
    String spenumber;
    String itemsdowntime;
    String itemsuptime;
    String username;
    String itemsintroduction;
    String state;
    String imgname;

    public ItemsSelect(String iditems, String itemsname, String spenumber, String itemsdowntime, String itemsuptime, String username, String itemsintroduction, String state, String imgname) {
        this.iditems = iditems;
        this.itemsname = itemsname;
        this.spenumber = spenumber;
        this.itemsdowntime = itemsdowntime;
        this.itemsuptime = itemsuptime;
        this.username = username;
        this.itemsintroduction = itemsintroduction;
        this.state = state;
        this.imgname = imgname;
    }

    public ItemsSelect() {
    }

    public String getIditems() {
        return iditems;
    }

    public void setIditems(String iditems) {
        this.iditems = iditems;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }

    public String getSpenumber() {
        return spenumber;
    }

    public void setSpenumber(String spenumber) {
        this.spenumber = spenumber;
    }

    public String getItemsdowntime() {

        return itemsdowntime.substring(itemsdowntime.indexOf('.'));
    }

    public void setItemsdowntime(String itemsdowntime) {

        this.itemsdowntime = itemsdowntime.substring(itemsdowntime.indexOf('.'));
    }

    public String getItemsuptime() {
        return itemsuptime;
    }

    public void setItemsuptime(String itemsuptime) {
        this.itemsuptime = itemsuptime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getItemsintroduction() {
        return itemsintroduction;
    }

    public void setItemsintroduction(String itemsintroduction) {
        this.itemsintroduction = itemsintroduction;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }
}
