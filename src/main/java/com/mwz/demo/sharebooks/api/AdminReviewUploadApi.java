package com.mwz.demo.sharebooks.api;


import com.mwz.demo.sharebooks.service.AdminReviewUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/reviewUpload")
public class AdminReviewUploadApi {
    @Autowired
    AdminReviewUploadService adminReviewUploadService;

    @RequestMapping("/reviewUpload")
    @ResponseBody
    public List<HashMap> reviewUpload(HttpServletRequest request){
        List<HashMap> list = adminReviewUploadService.reviewUpload();
        return list;
    }

    @RequestMapping("/reviewInsert")
    @ResponseBody
    public  Object reviewInsert(String iditems,String itemsname, String spenumber, String itemsdowntime, String username, String itemsintroduction,
                                String imgname, HttpServletRequest request){
        System.out.print("aaaaaaaa" + itemsdowntime);
        Integer i =adminReviewUploadService.reviewInsert(iditems,itemsname,spenumber,itemsdowntime,username,itemsintroduction,imgname);
        HashMap map = new HashMap();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }

    @RequestMapping("/onReviewUoload")
    @ResponseBody
    public  Object onReviewUpload(String iditems, HttpServletRequest request){
        Integer i = adminReviewUploadService.onReviewUpload(iditems);
        HashMap map = new HashMap();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
}
