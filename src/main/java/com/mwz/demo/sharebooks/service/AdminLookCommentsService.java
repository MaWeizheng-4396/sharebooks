package com.mwz.demo.sharebooks.service;


import java.util.HashMap;
import java.util.List;

public interface AdminLookCommentsService {

    public List<HashMap> adminCommentsSelect();

    public Integer addComments(String status,String userid,String speciesid);

    public Integer deleteComments(Integer id);
}
