package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.entity.ItemsSelect;
import com.mwz.demo.sharebooks.service.AdminItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/adminItems")
public class AdminItemsApi {
    @Autowired
    AdminItemsService adminItemsService;

    @RequestMapping("/adminItems")
    @ResponseBody
    public List<HashMap> adminItemsSelect(HttpServletRequest request){
        List<HashMap> list= adminItemsService.adminItemsSelect();
        return  list;
    }

    @RequestMapping("/deleteItems")
    @ResponseBody
    public Object deleteItems(Integer id,HttpServletRequest request){
        Integer i =adminItemsService.deleteItems(id);
        HashMap map = new HashMap();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }

    @RequestMapping("/addItems")
    @ResponseBody
    public  Object addItems(String itemsname,String spenumber, String username, String itemsintroduction,String imgname,
                            HttpServletRequest request){
        Integer i =adminItemsService.addItems(itemsname,spenumber,username,itemsintroduction, imgname);
        HashMap map = new HashMap();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }

    @RequestMapping("updateItems")
    @ResponseBody
    public Object updateItems(String itemsname,String spenumber,String username,String itemsintroduction,String imgname,String iditems, HttpServletRequest request){
        Integer i = adminItemsService.updateItems(itemsname,spenumber,username,itemsintroduction,imgname,iditems);
        HashMap map =new HashMap();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
}
