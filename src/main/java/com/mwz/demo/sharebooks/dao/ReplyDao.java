package com.mwz.demo.sharebooks.dao;

import com.mwz.demo.sharebooks.entity.Reply;
import org.springframework.stereotype.Repository;


@Repository
public interface ReplyDao {

   Integer ReplyInsert(Reply reply);
}
