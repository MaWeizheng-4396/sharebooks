package com.mwz.demo.sharebooks.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface AdminInterfaceDao {

    List<HashMap> adminInterfaceSelect();

    List<HashMap> userSelect();

    Integer addUsers(String usersname, String users_email, String  users_tel,String usersStudentId );

    Integer updateUserpwd( Integer idusers);

    Integer deleteUsers(Integer idusers);

    List<HashMap> adminInterSelect();
}
