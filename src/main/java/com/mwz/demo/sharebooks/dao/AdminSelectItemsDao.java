package com.mwz.demo.sharebooks.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface AdminSelectItemsDao {

    List<HashMap> adminItemsSelect();

    Integer deleteItems(Integer id);

    Integer addItems(String itemsname,String spenumber, String username, String itemsintroduction,String imgname);

    Integer updateItems(String itemsname,String spenumber,String username,String itemsintroduction,String imgname,String iditems);
}
