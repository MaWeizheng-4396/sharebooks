package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.AdminSelectItemsDao;
import com.mwz.demo.sharebooks.entity.ItemsSelect;
import com.mwz.demo.sharebooks.service.AdminItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AdminItemsImpl implements AdminItemsService {
    @Autowired
    AdminSelectItemsDao adminSelectItemsDao;

    @Override
    public List<HashMap> adminItemsSelect(){
        List<HashMap> list=adminSelectItemsDao.adminItemsSelect();
        return  list;
    };

    @Override
    public Integer deleteItems(Integer id){
        Integer i = adminSelectItemsDao.deleteItems(id);
        return i;
    };

    @Override
    public Integer addItems(String itemsname,String spenumber, String username, String itemsintroduction,String imgname){
        Integer i = adminSelectItemsDao.addItems(itemsname,spenumber,username,itemsintroduction,imgname);
        return i;
    };

    @Override
    public Integer updateItems(String itemsname,String spenumber,String username,String itemsintroduction,String imgname,String iditems){
            Integer i  = adminSelectItemsDao.updateItems(itemsname,spenumber,username,itemsintroduction,imgname,iditems);
            return  i;
    };

}
