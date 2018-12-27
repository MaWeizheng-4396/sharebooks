package com.mwz.demo.sharebooks.dao;

import com.mwz.demo.sharebooks.entity.Commonts;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface CommentsDao {
    Integer CommontsInsert(Commonts commonts);

    List<HashMap> commentsSelect(String com_speciesid);
}
