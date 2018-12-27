package com.mwz.demo.sharebooks.service;

import com.mwz.demo.sharebooks.entity.ItemsSelect;

import java.util.HashMap;
import java.util.List;

public interface AdminItemsService {

    public List<HashMap> adminItemsSelect();

    public Integer deleteItems(Integer id);

    public Integer addItems(String itemsname,String spenumber, String username, String itemsintroduction,String imgname);

    public Integer updateItems(String itemsname,String spenumber,String username,String itemsintroduction,String imgname,String iditems);
}
