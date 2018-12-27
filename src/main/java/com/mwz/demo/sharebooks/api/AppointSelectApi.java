package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.AppointSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/appointOwnSelect")
public class AppointSelectApi {
    @Autowired
    AppointSelectService appointSelectService;

    @RequestMapping("/appointSelect")
    @ResponseBody
    public List<HashMap> appointSelect(String userid, HttpServletRequest request){
        List<HashMap> list= appointSelectService.appointSelect(userid);
        return  list;
    }
}
