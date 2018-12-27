package com.mwz.demo.sharebooks.service;

import com.mwz.demo.sharebooks.entity.Admin;
import com.mwz.demo.sharebooks.entity.Users;
import org.apache.ibatis.annotations.Param;


public interface UserService {

    public Users login(String usersname, String userspwd);

    public  Integer updata(String idusers ,String users_email,String  users_tel);

    public Admin adminLogin(@Param("name") String name, @Param("pwd") String pwd);
}
