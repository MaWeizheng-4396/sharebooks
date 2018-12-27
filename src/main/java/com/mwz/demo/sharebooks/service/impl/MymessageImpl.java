package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.MymessageDao;
import com.mwz.demo.sharebooks.service.MymessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MymessageImpl implements MymessageService {
    @Autowired
    MymessageDao mymessageDao;

    @Override
    public List<HashMap> myMessageSelect(String usersname){
        List<HashMap > list = mymessageDao.myMessageSelect(usersname);
        return  list;
    };

    @Override
    public List<HashMap> appointsMessage(String usersname){
        List<HashMap > list = mymessageDao.appointsMessage(usersname);
        System.out.print(list + "asdfsafsdascxzcxczcvxzczvxczvxc    ");
        return  list;
    };

    @Override
    public List<HashMap> returnMessage(String appointuname){
        List<HashMap> list = mymessageDao.returnMessage(appointuname);
        System.err.print(list);
        return list;
    };

}
