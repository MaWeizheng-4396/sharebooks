package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
@RequestMapping("/api/userRegister")
public class UserRegisterApi {

    @Autowired
    UserRegisterService userRegisterService;

    @RequestMapping("/userRegister")
    @ResponseBody
    public  Object userRegister(String usersname, String userspwd, String users_email, String users_tel, String usersStudentId, HttpServletRequest request){
        Integer i =userRegisterService.userRegister(usersname,userspwd,users_email,users_tel,usersStudentId);
        HashMap<String,Object> map = new HashMap<>();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
}
