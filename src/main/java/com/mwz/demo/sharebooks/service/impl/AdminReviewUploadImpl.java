package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.AdminReviewUploadDao;
import com.mwz.demo.sharebooks.service.AdminReviewUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AdminReviewUploadImpl implements AdminReviewUploadService {
    @Autowired
    AdminReviewUploadDao adminReviewUploadDao;

    public List<HashMap> reviewUpload(){
        List<HashMap> list= adminReviewUploadDao.reviewUpload();
        return  list;
    };

    @Override
    public Integer reviewInsert(String iditems,String itemsname, String spenumber, String itemsdowntime, String username, String itemsintroduction,String imgname){
        Integer i = adminReviewUploadDao.reviewInsert(iditems);
        Integer i1= adminReviewUploadDao.adminItemsInsert(itemsname,spenumber,itemsdowntime,username,itemsintroduction,imgname);
        return  i;
    };

    @Override
    public Integer onReviewUpload(String iditems){
        Integer i =adminReviewUploadDao.onReviewUpload(iditems);
        return  i;
    };
}
