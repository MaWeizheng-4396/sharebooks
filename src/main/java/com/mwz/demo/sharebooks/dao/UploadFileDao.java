package com.mwz.demo.sharebooks.dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UploadFileDao {
    Integer uploadFile(String itemsname, String spenumber, String username,String itemsintroduction, String imageurl);

    List<HashMap> selectImgid(String imgname);
}
