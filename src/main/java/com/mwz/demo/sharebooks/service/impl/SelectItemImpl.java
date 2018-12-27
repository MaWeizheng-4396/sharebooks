package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.SelectItemDao;
import com.mwz.demo.sharebooks.service.SelectItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelectItemImpl implements SelectItemService {
    @Autowired
    SelectItemDao selectItemDao;

    @Override
    public List<HashMap> selectItem(String itemsName){
        Map<String,String> map=new HashMap<>();
        List<HashMap> list =null;
        if(itemsName !=null && itemsName!=""){
            map.put("itemsname",itemsName);
            list=selectItemDao.selectItem(map);
        }

        return  list;

    }
}
