package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.DownSelectDao;
import com.mwz.demo.sharebooks.service.DownSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class DownSelectImpl implements DownSelectService {
    @Autowired
    DownSelectDao downSelectDao;

    @Override
    public List<HashMap> downSelect(String idusers){
        List<HashMap> list= downSelectDao.downSelect(idusers);
        return  list;
    };
}
