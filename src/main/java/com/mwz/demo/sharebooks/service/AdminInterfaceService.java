package com.mwz.demo.sharebooks.service;

import java.util.HashMap;
import java.util.List;

public interface AdminInterfaceService {
    public List<HashMap> adminInterfaceSelect();

    public List<HashMap> userSelect();

    public Integer addUsers(String usersname, String users_email, String  users_tel,String usersStudentId );

    public Integer updateUserpwd( Integer idusers);

    public Integer deleteUsers(Integer idusers);

    public  List<HashMap> adminInterSelect();
}
