package com.mwz.demo.sharebooks.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRegisterDao {

    Integer userRegister(String usersname,String userspwd,String users_email,String users_tel,String usersStudentId);
}
