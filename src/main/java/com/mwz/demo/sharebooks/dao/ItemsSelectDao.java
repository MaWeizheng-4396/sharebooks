package com.mwz.demo.sharebooks.dao;

import com.mwz.demo.sharebooks.entity.ItemsSelect;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ItemsSelectDao {

    List<ItemsSelect> itemsSelect(String itemsname);
}
