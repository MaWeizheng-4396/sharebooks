package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.entity.Appoint;
import com.mwz.demo.sharebooks.service.AppointService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/appointSelect")
public class AppointApi {
    @Autowired
    AppointService appointService;

    @RequestMapping("/appointSelect")
    @ResponseBody
    public List<HashMap> appointSelect(String imgname, HttpServletRequest request){
        List<HashMap> list= appointService.appointSelect(imgname);
        if(list.size()>0){
            return  list;
        }else {
            return  list;
        }
    }

    @RequestMapping("insertAppoint")
    @ResponseBody
    public  Object appointInsert(String appointuname, String imgId, String userId, HttpServletRequest request){
        Integer i = appointService.appointInsert(appointuname,imgId,userId) ;
        HashMap<String,Object> map = new HashMap<>();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }

    @RequestMapping("/appointImgname")
    @ResponseBody
    public  List<HashMap> appointImgname(String imgname, HttpServletRequest request){
        List<HashMap> list= appointService.appointImgname(imgname);
        if(list.size()>0){
            return  list;
        }else {
            return  null;
        }
    }

    @RequestMapping("returnAppiont")
    @ResponseBody
    public  List<HashMap> returnAppoint(String usersname,HttpServletRequest request){
        List<HashMap> list =appointService.returnAppiont(usersname);
        return  list;
    }

    @RequestMapping("/updateAppoint")
    @ResponseBody
    public  Object updateAppoint(Integer idappoint,HttpServletRequest request) {
        Integer i = appointService.updateAppoint(idappoint);
        HashMap<String, Object> map = new HashMap<>();
        if (i != null) {
            map.put("code", "200");
        } else {
            map.put("code", "250");
        }
        System.out.print("ddd");
        return map;
    }

    @RequestMapping("/updateOnAppoint")
    @ResponseBody
    public  Object updateOnAppoint(Integer idappoint,HttpServletRequest request) {
        Integer i = appointService.updateOnAppoint(idappoint);
        HashMap<String, Object> map = new HashMap<>();
        if (i != null) {
            map.put("code", "200");
        } else {
            map.put("code", "250");
        }
        System.out.print("ddd");
        return map;
    }

    @RequestMapping("/retutnUpdata")
    @ResponseBody
    public Object returnUpdata(String imgname, HttpServletRequest request){
       Integer i= appointService.returnUpdata(imgname);
        HashMap<String, Object> map = new HashMap<>();
        if (i != null) {
            map.put("code", "200");
        } else {
            map.put("code", "250");
        }
        System.out.print("ddd");
        return map;
    }

    @RequestMapping("/selectUser")
    @ResponseBody
    public  List<HashMap> selectUser(String  imgname,HttpServletRequest request){
        List<HashMap> list= appointService.selectUser(imgname);
        return  list;
    }


    @RequestMapping("/deterReturn")
    @ResponseBody
    public  Object deterReturn(String imgname,HttpServletRequest request){
        Integer i= appointService.deterReturn(imgname);
        HashMap<String, Object> map = new HashMap<>();
        if (i != null) {
            map.put("code", "200");
        } else {
            map.put("code", "250");
        }
        System.out.print("ddd");
        return map;
    }
}
