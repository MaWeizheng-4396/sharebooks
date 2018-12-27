package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.entity.Commonts;
import com.mwz.demo.sharebooks.service.AdminLookCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/adminComments")
public class AdminLookCommentsApi {
    @Autowired
    AdminLookCommentsService adminLookCommentsService;

    @RequestMapping("/adminLookComments")
    @ResponseBody
    public List<HashMap> adminCommentsSelect(HttpServletRequest request){
        List<HashMap> list= adminLookCommentsService.adminCommentsSelect();
        return list;
    }

    @RequestMapping("/addComments")
    @ResponseBody
    public  Object addComments(String status,String userid,String speciesid,HttpServletRequest request){
        Integer i= adminLookCommentsService.addComments(status,userid,speciesid);
        HashMap map = new HashMap();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }

    @RequestMapping("/deleteComments")
    @ResponseBody
    public  Object deleteComments(Integer id,HttpServletRequest request){
        Integer i =adminLookCommentsService.deleteComments(id);
        HashMap map = new HashMap();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
}
