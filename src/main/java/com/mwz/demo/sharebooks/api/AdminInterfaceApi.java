package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.AdminInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/adminInterface")
public class AdminInterfaceApi {

    @Autowired
    AdminInterfaceService adminInterfaceService;

    @RequestMapping("/adminInterface")
    @ResponseBody
    public List<HashMap> adminInterfaceSelect(HttpServletRequest request){
        List<HashMap> list =adminInterfaceService.adminInterfaceSelect();
        System.err.print(list);
        return list;
    }

    @RequestMapping("/adminInterSelect")
    @ResponseBody
    public List<HashMap> adminInterSelect(HttpServletRequest request){
        List<HashMap> list =adminInterfaceService.adminInterSelect();
        return  list;
    }
    @RequestMapping("/userSelect")
    @ResponseBody
    public  List<HashMap> userSelect(){
        List<HashMap> list = adminInterfaceService.userSelect();
        return list;
    }

    @RequestMapping("/addUsers")
    @ResponseBody
    public Object addUsers(String usersname, String users_email, String  users_tel,String usersStudentId ,HttpServletRequest request){
        Integer i = adminInterfaceService.addUsers(usersname,users_email,users_tel,usersStudentId);
        HashMap<String,Object> map = new HashMap<>();
        if(i != null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
    @RequestMapping("/updateUserpwd")
    @ResponseBody
    public  Object updateUserpwd(Integer  idusers, HttpServletRequest request){
        Integer i = adminInterfaceService.updateUserpwd(idusers);
        HashMap map =new HashMap();
        if(i!=null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }

    @RequestMapping("/deleteUsers")
    public  Object deleteUsers(Integer idusers,HttpServletRequest request){
        Integer i = adminInterfaceService.deleteUsers(idusers);
        HashMap map =new HashMap();
        if(i!=null){
            map.put("code","200");
        }else {
            map.put("code","250");
        }
        return  map;
    }
}
