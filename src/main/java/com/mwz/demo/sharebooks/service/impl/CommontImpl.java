package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.CommentsDao;
import com.mwz.demo.sharebooks.entity.Commonts;
import com.mwz.demo.sharebooks.service.CommontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CommontImpl  implements CommontService {
    @Autowired
    CommentsDao commentsDao;

    @Override
    public Integer CommontsInsert(Commonts commonts){
        Integer i = commentsDao.CommontsInsert(commonts);
        return  i;
    }

    @Override
    public List<HashMap> commentsSelect(String com_speciesid){
        List<HashMap> list = commentsDao.commentsSelect(com_speciesid);
        return  list;
    }

}
