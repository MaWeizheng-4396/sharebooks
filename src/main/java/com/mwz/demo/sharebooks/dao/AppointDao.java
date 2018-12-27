package com.mwz.demo.sharebooks.dao;

import com.mwz.demo.sharebooks.entity.Appoint;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface AppointDao {
    List<HashMap> appointSelect(String imgname);

    Integer appointInsert(String appointuname, String imgId, String userId);

    List<HashMap> appointImgname(String imgname);

    List<HashMap> returnAppiont(String usersname);

    Integer updateAppoint(Integer idappoint);

    Integer updateOnAppoint(Integer idappoint);

    Integer returnUpdata(String imgname);

    List<HashMap> selectUser(String imgname);

    Integer deterReturn(String imgname);
}
