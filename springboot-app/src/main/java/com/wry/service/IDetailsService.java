package com.wry.service;

import com.wry.pojo.Details;

import java.util.List;

public interface IDetailsService {

    //查所有记录
    List<Details> findAll();

    //添加记录
    int saveDetails(Details details);
}
