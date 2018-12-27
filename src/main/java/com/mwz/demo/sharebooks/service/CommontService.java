package com.mwz.demo.sharebooks.service;

import com.mwz.demo.sharebooks.entity.Commonts;

import java.util.HashMap;
import java.util.List;

public interface CommontService{
    // 评论
    public  Integer CommontsInsert(Commonts commonts);
    // 查询评论
    public List<HashMap> commentsSelect(String com_speciesid);
}
