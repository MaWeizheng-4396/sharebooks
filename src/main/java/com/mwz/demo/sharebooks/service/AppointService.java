package com.mwz.demo.sharebooks.service;

import com.mwz.demo.sharebooks.entity.Appoint;

import java.util.HashMap;
import java.util.List;

public interface AppointService {
    public List<HashMap> appointSelect(String imgname);

    public  Integer appointInsert(String appointuname, String imgId, String userId);

    public  List<HashMap> appointImgname(String imgname);

    public List<HashMap> returnAppiont(String usersname);

    public Integer updateAppoint(Integer idappoint);

    public Integer updateOnAppoint(Integer idappoint);

    public Integer returnUpdata(String imgname);

    public List<HashMap> selectUser(String imgname);

    public Integer deterReturn(String imgname);


}
