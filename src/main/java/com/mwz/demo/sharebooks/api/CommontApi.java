package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.entity.Commonts;
import com.mwz.demo.sharebooks.service.CommontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/commonts")
public class CommontApi {
    @Autowired
    CommontService commontService;


    @RequestMapping("/commonts")
    @ResponseBody
    public Object CommontsInsert(Commonts commonts, HttpServletRequest request){
        Integer i =commontService.CommontsInsert(commonts);
        HashMap<String,Object> map = new HashMap<>();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }

    @RequestMapping("/select")
    @ResponseBody
    public List<HashMap> commentsSelect(String com_speciesid, HttpServletRequest request){
        List<HashMap> list = commontService.commentsSelect(com_speciesid);
        return list;
    }
}

