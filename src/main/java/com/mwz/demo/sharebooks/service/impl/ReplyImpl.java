package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.ReplyDao;
import com.mwz.demo.sharebooks.entity.Reply;
import com.mwz.demo.sharebooks.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyImpl  implements ReplyService {
    @Autowired
    ReplyDao replyDao;

    @Override
    public  Integer ReplyInsert(Reply reply){
        Integer i =replyDao.ReplyInsert(reply);
        return  i;
    }
}
