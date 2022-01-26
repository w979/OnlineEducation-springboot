package com.wry.service;

import com.wry.pojo.Subject;

import java.util.List;

public interface ISubjectService {
    //查询所有科目
    List<Subject> findSubject();

    //根据id查询学生选修课程
    List<Subject> getSubByUserId(Integer studentid);
}
