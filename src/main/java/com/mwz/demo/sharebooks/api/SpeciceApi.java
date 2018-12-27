package com.mwz.demo.sharebooks.api;


import com.mwz.demo.sharebooks.entity.Species;
import com.mwz.demo.sharebooks.service.SpeciesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/species")
public class SpeciceApi {

    Logger logger = LoggerFactory.getLogger(Species.class);

    @Autowired
    SpeciesService speciesService;

    @RequestMapping("/species")
    @ResponseBody
    public  Object searchSpec(HttpServletRequest request) throws Exception {
        List<Species> species = speciesService.serchSpec();
        return  species;
    }
    @RequestMapping("/speciesImg")
    @ResponseBody
    public  List<HashMap> selectImg(String imgname, HttpServletRequest request){
        List<HashMap> list = speciesService.selectImg(imgname);
        return list;
    }

    @RequestMapping("/itemSelect")
    @ResponseBody
    public  List<HashMap> itemSelect(HttpServletRequest request){
        List<HashMap> list= speciesService.itemSelect();
        return  list;
    }
}
