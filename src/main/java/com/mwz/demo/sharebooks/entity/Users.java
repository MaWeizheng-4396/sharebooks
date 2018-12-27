package com.mwz.demo.sharebooks.entity;

public class Users {

    String idusers;
    String users_name;
    String usersname;
    String userspwd;
    String users_email;
    String users_tel;
    String usersStudentId;

    public String getIdusers() {
        return idusers;
    }

    public void setIdusers(String idusers) {
        this.idusers = idusers;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    public String getUserspwd() {
        return userspwd;
    }

    public void setUserspwd(String userspwd) {
        this.userspwd = userspwd;
    }

    public String getUsers_email() {
        return users_email;
    }

    public void setUsers_email(String users_email) {
        this.users_email = users_email;
    }

    public String getUsers_tel() {
        return users_tel;
    }

    public void setUsers_tel(String users_tel) {
        this.users_tel = users_tel;
    }

    public String getUsersStudentId() {
        return usersStudentId;
    }

    public void setUsersStudentId(String usersStudentId) {
        this.usersStudentId = usersStudentId;
    }

    public Users(String idusers, String users_name, String usersname, String userspwd, String users_email, String users_tel, String usersStudentId) {
        this.idusers = idusers;
        this.users_name = users_name;
        this.usersname = usersname;
        this.userspwd = userspwd;
        this.users_email = users_email;
        this.users_tel = users_tel;
        this.usersStudentId = usersStudentId;
    }


    public Users() {
    }
}
