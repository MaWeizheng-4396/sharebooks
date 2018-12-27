package com.mwz.demo.sharebooks.service;


import java.util.HashMap;
import java.util.List;

public interface AdminReviewUploadService{
    public List<HashMap> reviewUpload();

    public Integer reviewInsert(String iditems,String itemsname, String spenumber, String itemsdowntime, String username, String itemsintroduction,String imgname);

    public Integer onReviewUpload(String iditems);
}
