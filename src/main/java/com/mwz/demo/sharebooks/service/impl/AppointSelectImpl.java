package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.AppointSelectDao;
import com.mwz.demo.sharebooks.service.AppointSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AppointSelectImpl implements AppointSelectService {
    @Autowired
    AppointSelectDao appointSelectDao;

    @Override
    public List<HashMap> appointSelect(String  userid){
        List<HashMap> list = appointSelectDao.appointSelect(userid);
        return  list;
    };

}
