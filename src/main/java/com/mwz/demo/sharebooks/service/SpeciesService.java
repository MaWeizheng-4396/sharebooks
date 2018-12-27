package com.mwz.demo.sharebooks.service;

import com.mwz.demo.sharebooks.entity.Species;

import java.util.HashMap;
import java.util.List;

public interface SpeciesService {

    public List<Species> serchSpec();
    public List<HashMap> selectImg (String imgname);

    public List<HashMap> itemSelect();
}
