package com.mwz.demo.sharebooks.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface SelectItemDao {
        List<HashMap> selectItem(Map map);

}
