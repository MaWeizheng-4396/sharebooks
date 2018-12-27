package com.mwz.demo.sharebooks.dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface MymessageDao {
    List<HashMap> myMessageSelect(String usersname);

    List<HashMap> appointsMessage(String usersname);

    List<HashMap> returnMessage(String appointuname);
}
