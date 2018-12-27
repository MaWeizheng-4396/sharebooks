package com.mwz.demo.sharebooks.dao;

import com.mwz.demo.sharebooks.entity.Species;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface SpeciesDao {

    @Select("select * from species")
    @ResultType(Species.class)
    List<Species> searchSpec();

    List<HashMap> selectImg (String imgname);

    List<HashMap> itemSelect();
}
