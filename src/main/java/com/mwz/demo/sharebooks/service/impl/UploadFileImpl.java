package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.UploadFileDao;
import com.mwz.demo.sharebooks.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UploadFileImpl implements UploadFileService {
    @Autowired
    UploadFileDao uploadFileDao;

    @Override
    public  Integer uploadFile(String itemsname, String spenumber, String username,String itemsintroduction, String imageurl){
        Integer i = uploadFileDao.uploadFile(itemsname,spenumber,username,itemsintroduction,imageurl);
        return  i;
    }

    @Override
    public List<HashMap> selectImgid(String imgname){
        List<HashMap> list = uploadFileDao.selectImgid(imgname);
        return  list;
    };
}
