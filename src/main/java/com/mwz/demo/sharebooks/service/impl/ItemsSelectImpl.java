package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.ItemsSelectDao;
import com.mwz.demo.sharebooks.entity.ItemsSelect;
import com.mwz.demo.sharebooks.service.ItemSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsSelectImpl implements ItemSelectService {

        @Autowired
    ItemsSelectDao itemsSelectDao;

        @Override
    public List<ItemsSelect>  itemSelect(String itemsname) {
             List<ItemsSelect> itemsSelects = itemsSelectDao.itemsSelect(itemsname);
            return  itemsSelects;
        }

}
