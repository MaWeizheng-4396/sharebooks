package com.mwz.demo.sharebooks.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface InformationDao {

    List<HashMap> informationSelect(String imgname);
}
