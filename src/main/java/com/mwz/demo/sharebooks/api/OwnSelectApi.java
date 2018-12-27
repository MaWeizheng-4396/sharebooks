package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.OwnSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/ownselect")
public class OwnSelectApi {
    @Autowired
    OwnSelectService ownSelectService;

    @RequestMapping("/ownselect")
    @ResponseBody
    public List<HashMap> ownSelect (String usersname, HttpServletRequest request){
        List<HashMap> list= ownSelectService.ownSelect(usersname);
        return  list;
    }
}
