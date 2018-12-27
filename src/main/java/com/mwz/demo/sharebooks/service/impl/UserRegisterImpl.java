package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.UserRegisterDao;
import com.mwz.demo.sharebooks.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterImpl implements UserRegisterService {
    @Autowired
    UserRegisterDao userRegisterDao;

    @Override
    public Integer userRegister(String usersname,String userspwd,String users_email,String users_tel,String usersStudentId){
        Integer i = userRegisterDao.userRegister(usersname,userspwd,users_email,users_tel,usersStudentId);
        return i;
    };

}
