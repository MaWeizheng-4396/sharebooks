package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.DownSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/downSelect")
public class DownSelectApi {
    @Autowired
    DownSelectService downSelectService;

    @RequestMapping("/downSelect")
    @ResponseBody
    public List<HashMap> downSelect(String idusers, HttpServletRequest request){
        List<HashMap> list = downSelectService.downSelect(idusers);
        return  list;
    }
}
