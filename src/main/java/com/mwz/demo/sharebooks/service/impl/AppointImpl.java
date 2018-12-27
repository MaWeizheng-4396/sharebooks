package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.AppointDao;
import com.mwz.demo.sharebooks.entity.Appoint;
import com.mwz.demo.sharebooks.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AppointImpl implements AppointService {
    @Autowired
    AppointDao appointDao;


    @Override
    public List<HashMap> appointSelect(String imgname){
        List<HashMap> list = appointDao.appointSelect(imgname);
        return  list;
    };

    @Override
    public Integer appointInsert(String appointuname, String imgId, String userId) {
        Integer i = appointDao.appointInsert(appointuname,imgId,userId);
        return i;
    }

    @Override
    public List<HashMap> appointImgname(String imgname) {
        List<HashMap> list= appointDao.appointImgname(imgname);

        return list;
    }

    @Override
    public List<HashMap> returnAppiont(String usersname){
        List<HashMap> list= appointDao.returnAppiont(usersname);
        return  list;
    }

    @Override
    public Integer updateAppoint(Integer idappoint){
        Integer i = appointDao.updateAppoint(idappoint);
        return  i;
    };

    @Override
    public Integer updateOnAppoint(Integer idappoint){
        Integer i = appointDao.updateOnAppoint(idappoint);
        return  i;
    };

    @Override
    public Integer returnUpdata(String imgname) {
        Integer list = appointDao.returnUpdata(imgname);
        return list;
    }

    @Override
    public List<HashMap> selectUser(String imgname){
        List<HashMap> list = appointDao.selectUser(imgname);
        return  list;
    };

    @Override
    public Integer deterReturn(String imgname){
        Integer i =appointDao.deterReturn(imgname);
        return  i;
    };


}
