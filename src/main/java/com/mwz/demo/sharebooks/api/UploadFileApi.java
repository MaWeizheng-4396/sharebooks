package com.mwz.demo.sharebooks.api;

import com.mwz.demo.sharebooks.service.UploadFileService;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/uploadFile")
public class UploadFileApi {
    @Autowired
    UploadFileService uploadFileService;
    private static final Logger logger = LoggerFactory.getLogger(UploadFileApi.class);

    private static final String UTF_8 = "UTF-8";


    @ResponseBody
    @PostMapping("/uploadFile")
    public Map<String,Object> uploadFile(HttpServletRequest request, @RequestParam(value = "file") MultipartFile image){
        MultipartHttpServletRequest params=((MultipartHttpServletRequest) request);
        Map<String, Object> map = new HashMap<String, Object>();
        String path = "/home/mwz/bs/shareBook/src/assets/imgs";
        String returnpath = path;
        System.out.print("aaa" + returnpath);
        String imagename = image.getOriginalFilename();
        String itemsname=params.getParameter("itemsname");
        String itemsintroduction=params.getParameter("statusdata");
        String username = params.getParameter("username");
        String spenumber= params.getParameter("spenumber");
        String imageurl = imagename;
        if(image != null){
            File filename = new File(path , imagename);
            System.out.print("地址:" + filename);
           try {
                image.transferTo(filename);
                map.put("code", 200);
                map.put("imagename" , imagename);
                map.put("itemsname" , itemsname);
                map.put("itemsintroduction" , itemsintroduction);
                map.put("username" , username);
                map.put("spenumber" , spenumber);
                map.put("imageurl",  imagename );
                Integer i =uploadFileService.uploadFile(itemsname,spenumber,username,itemsintroduction,imageurl);
            } catch (IOException e) {
                e.printStackTrace();
                map.put("code", 250);
            }
        }
        System.out.print(map);
        return  map;
    }


    @RequestMapping("/selectImgid")
    @ResponseBody
    public  List<HashMap> selectImgid(String imgname, HttpServletRequest request){
        List<HashMap> list = uploadFileService.selectImgid(imgname);
        return list;
    }
}
