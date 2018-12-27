package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/information")
public class InformationApi {

    @Autowired
    InformationService informationService;

    @RequestMapping("/information")
    @ResponseBody
    public List<HashMap> informationSelect(String imgname,  HttpServletRequest request){
        List<HashMap> list = informationService.informationSelect(imgname);
        return  list;
    }

}
