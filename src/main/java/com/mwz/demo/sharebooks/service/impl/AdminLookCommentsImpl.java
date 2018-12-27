package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.AdminLookCommentsDao;
import com.mwz.demo.sharebooks.service.AdminLookCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AdminLookCommentsImpl implements AdminLookCommentsService {
    @Autowired
    AdminLookCommentsDao adminLookCommentsDao;

    @Override
    public  List<HashMap> adminCommentsSelect(){
        List<HashMap> list = adminLookCommentsDao.adminCommentsSelect();
        return  list;
    };

    @Override
    public Integer addComments(String status,String userid,String speciesid){
        Integer i = adminLookCommentsDao.addComments(status,userid,speciesid);
        return i;
    };

    @Override
    public Integer deleteComments(Integer id){
        Integer i = adminLookCommentsDao.deleteComments(id);
        return i;
    };
}
