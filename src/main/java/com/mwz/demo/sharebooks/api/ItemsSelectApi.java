package com.mwz.demo.sharebooks.api;


import com.mwz.demo.sharebooks.entity.ItemsSelect;
import com.mwz.demo.sharebooks.service.ItemSelectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemsSelectApi {

    Logger logger = LoggerFactory.getLogger(ItemsSelect.class);

    @Autowired
    ItemSelectService itemSelectService;

    @RequestMapping("/items")
    @ResponseBody
    public List<ItemsSelect> itemsSelect (String itemsname, HttpServletRequest request){
        System.out.print("aaa");
        List<ItemsSelect> itemsSelects = itemSelectService.itemSelect(itemsname);
        return  itemsSelects;
    }

}
