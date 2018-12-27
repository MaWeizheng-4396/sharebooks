package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.SelectItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/selectItem")
public class SelectItemApi {
    @Autowired
    SelectItemService selectItemService;

    @RequestMapping("/selectItem")
    @ResponseBody
    public  List<HashMap> selectItem(String itemsname, HttpServletRequest request){
        List<HashMap> list =selectItemService.selectItem(itemsname);
        return  list;
    }
}
