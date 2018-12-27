package com.mwz.demo.sharebooks.service.impl;

import com.mwz.demo.sharebooks.dao.SpeciesDao;
import com.mwz.demo.sharebooks.entity.Species;
import com.mwz.demo.sharebooks.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SpeciesServiceImpl implements SpeciesService {
    @Autowired
    SpeciesDao speciesDao;

    @Override
    public List<Species> serchSpec() {
        List<Species> species = speciesDao.searchSpec();
        return species;
    }

    @Override
    public List<HashMap> selectImg(String imgname){
        List<HashMap> list = speciesDao.selectImg(imgname);
        return  list;
    }

    @Override
    public List<HashMap> itemSelect(){
        List<HashMap> list = speciesDao.itemSelect();
        return list;
    };
}
