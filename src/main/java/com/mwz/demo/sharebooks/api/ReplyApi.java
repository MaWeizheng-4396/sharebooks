package com.mwz.demo.sharebooks.api;


import com.mwz.demo.sharebooks.entity.Reply;
import com.mwz.demo.sharebooks.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
@RequestMapping("/api/reply")
public class ReplyApi {
    @Autowired
    ReplyService replyService;

    @RequestMapping("/reply")
    @ResponseBody
    public  Object ReplyInsert(Reply reply, HttpServletRequest request){
        Integer i =replyService.ReplyInsert(reply);
        HashMap<String,Object> map = new HashMap<>();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
}
