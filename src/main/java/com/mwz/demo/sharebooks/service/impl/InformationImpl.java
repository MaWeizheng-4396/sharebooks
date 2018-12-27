package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.InformationDao;
import com.mwz.demo.sharebooks.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class InformationImpl implements InformationService {

    @Autowired
    InformationDao informationDao;

    @Override
    public List<HashMap>  informationSelect(String imgname){
        List<HashMap> list = informationDao.informationSelect(imgname);
        return  list;
    }
}
