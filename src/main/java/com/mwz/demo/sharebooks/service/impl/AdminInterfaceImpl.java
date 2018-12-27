package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.AdminInterfaceDao;
import com.mwz.demo.sharebooks.service.AdminInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class AdminInterfaceImpl implements AdminInterfaceService {
    @Autowired
    AdminInterfaceDao adminInterfaceDao;


    @Override
    public List<HashMap> adminInterfaceSelect() {
        List<HashMap> list =adminInterfaceDao.adminInterfaceSelect();
        return list;
    }

    @Override
    public List<HashMap> userSelect(){
      List<HashMap> list= adminInterfaceDao.userSelect();
      return  list;
    };

    @Override
    public Integer addUsers(String usersname, String users_email, String  users_tel,String usersStudentId ){
        Integer i = adminInterfaceDao.addUsers(usersname,users_email,users_tel,usersStudentId);
        return  i;
    };

    @Override
    public Integer updateUserpwd( Integer idusers){
        Integer i = adminInterfaceDao.updateUserpwd(idusers);
        return i;
    };

    @Override
    public Integer deleteUsers(Integer idusers){
        Integer i =adminInterfaceDao.deleteUsers(idusers);
        return i;
    };

    @Override
    public  List<HashMap> adminInterSelect(){
        List<HashMap> list = adminInterfaceDao.adminInterSelect();
        return list;
    };

}
