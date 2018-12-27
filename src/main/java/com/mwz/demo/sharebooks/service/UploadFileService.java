package com.mwz.demo.sharebooks.service;

import java.util.HashMap;
import java.util.List;

public interface UploadFileService {

    public  Integer uploadFile(String itemsname, String spenumber, String username,String itemsintroduction, String imageurl);

    public List<HashMap> selectImgid(String imgname);
}
