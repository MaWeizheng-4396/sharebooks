package com.mwz.demo.sharebooks.service.impl;


import com.mwz.demo.sharebooks.dao.OwnSelectDao;
import com.mwz.demo.sharebooks.service.OwnSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class OwnSelectImpl  implements OwnSelectService {
    @Autowired
    OwnSelectDao ownSelectDao;

    @Override
    public List<HashMap> ownSelect(String usersname){
        List<HashMap> list = ownSelectDao.ownSelect(usersname);
        return  list;
    }

 }
