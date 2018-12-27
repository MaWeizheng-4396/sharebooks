package com.mwz.demo.sharebooks.service;


import java.util.HashMap;
import java.util.List;

public interface MymessageService {
    public List<HashMap> myMessageSelect(String usersname);

    public  List<HashMap> appointsMessage(String usersname);

    public List<HashMap> returnMessage(String appointuname);

}
