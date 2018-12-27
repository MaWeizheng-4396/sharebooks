package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.UsersDao;
import com.mwz.demo.sharebooks.entity.Admin;
import com.mwz.demo.sharebooks.entity.Users;
import com.mwz.demo.sharebooks.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersDao usersdao;

    @Override
    public Users login(String usersname, String userspwd){
            Users users = usersdao.login(usersname,userspwd);
            return users;
    }

    @Override
    public  Integer updata(String idusers ,String users_email,String  users_tel){
            Integer i = usersdao.updata(idusers,users_email,users_tel);
//        Users users=new Users();
//        users.setIdusers(idusers);
//        users.setUsers_email(users_email);
//        users.setUsers_tel(users_tel);
//        Integer i =-1;
//        try {
//            i=usersdao.updata(users);
//        }catch (Exception e){
//            e.getStackTrace();
//        }
        return  i;
    }

    @Override
    public  Admin adminLogin(@Param("name") String name, @Param("pwd") String pwd){
        Admin admin =usersdao.adminLogin(name,pwd);
        return  admin;
    };
}
