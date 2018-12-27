package com.mwz.demo.sharebooks.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@Mapper
public interface AppointSelectDao {

    List<HashMap> appointSelect(String  userid);
}
