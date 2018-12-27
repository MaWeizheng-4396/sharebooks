package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.MymessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/mymessage")
public class MymessageApi {
    @Autowired
    MymessageService mymessageService;

    @RequestMapping("/mymessage")
    @ResponseBody
    public List<HashMap> myMessageSelect(String usersname, HttpServletRequest request){
        List<HashMap> list = mymessageService.myMessageSelect(usersname);
        return  list;
    }

    @RequestMapping("/appointsMessage")
    @ResponseBody
    public List<HashMap> appointsMessage(String usersname, HttpServletRequest request){
        List<HashMap> list = mymessageService.appointsMessage(usersname);
        System.out.print( "adsfasdfasdfasdfasdfasfasdfsdf" + list);
        return  list;
    }

    @RequestMapping("/returnMessage")
    @ResponseBody
    public  List<HashMap> returnMessage(String appointuname, HttpServletRequest request){
        List<HashMap> list =mymessageService.returnMessage(appointuname);
        return list;
     }
}
