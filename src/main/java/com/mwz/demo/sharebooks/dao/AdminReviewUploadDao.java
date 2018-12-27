package com.mwz.demo.sharebooks.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface AdminReviewUploadDao {
    List<HashMap> reviewUpload();

    Integer reviewInsert(String iditems);

    Integer adminItemsInsert(String itemsname, String spenumber, String itemsdowntime, String username, String itemsintroduction,String imgname);

    Integer onReviewUpload(String iditems);
}
