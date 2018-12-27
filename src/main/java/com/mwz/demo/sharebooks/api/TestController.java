package com.mwz.demo.sharebooks.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping("/ttt")
    public String getCurrentUser(HttpServletRequest request){
        return "hh";
    }


}
