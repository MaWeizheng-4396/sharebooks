package com.mwz.demo.sharebooks.dao;

import com.mwz.demo.sharebooks.entity.Admin;
import com.mwz.demo.sharebooks.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UsersDao {

    @Select("select * from users where usersname=#{usersname} and userspwd=#{userspwd}")
    @ResultType(Users.class)
    Users login (@Param("usersname") String usersname, @Param("userspwd") String userspwd);


    Integer updata(String idusers ,String users_email,String  users_tel);

    @Select("select * from admin where name=#{name} and pwd =#{pwd}")
    Admin adminLogin(@Param("name") String name, @Param("pwd") String pwd);
}
