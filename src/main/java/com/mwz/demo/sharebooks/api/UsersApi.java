package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.entity.Admin;
import com.mwz.demo.sharebooks.entity.Users;
import com.mwz.demo.sharebooks.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;


@RestController
@RequestMapping("/api/login")
public class UsersApi {
    Logger logger = LoggerFactory.getLogger(Users.class);
    @Autowired
    UserService usersvice;

    @RequestMapping("/user/dologin")
    public String doLogin() {
        return "login";
    }


    @RequestMapping("/user/login")
    @ResponseBody
    public Object login1(@RequestParam("usersname") String usersname, @RequestParam("userspwd") String userspwd, HttpServletRequest request) throws Exception {
        Users user = usersvice.login(usersname, userspwd);
        HashMap<String,Object> map = new HashMap<>();
        if(!user.getIdusers().equals(null)||user.getIdusers().equals("") ){
           //ok
            map.put("code","200");
            map.put("user", user);
       }else {
           //error
            map.put("code", "250");
       }
       return  map;
    }
    @RequestMapping("/adminLogin")
    @ResponseBody
    public  Object adminLogin(@RequestParam("name") String name, @RequestParam("pwd") String pwd, HttpServletRequest request){
        Admin admin =usersvice.adminLogin(name,pwd);
        System.out.print("进来没");
        HashMap<String,Object> map = new HashMap<>();
        if(!admin.getId().equals(null)|| admin.getId().equals("")){
            map.put("code","200");
            map.put("user", admin);
        }else {
            //error
            map.put("code", "250");
        }
        return  map;
    }

    @RequestMapping("/updata")
    @ResponseBody
    public  Object updata(String idusers ,String users_email,String  users_tel, HttpServletRequest request){
        Integer i = usersvice.updata(idusers, users_email, users_tel);
        HashMap<String,Object> map = new HashMap<>();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
}
