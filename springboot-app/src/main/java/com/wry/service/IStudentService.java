package com.wry.service;

import com.wry.pojo.Student;

import java.util.List;


public interface IStudentService {
    //查询所有学生信息
    List<Student> findAllStu(String stuname,String grade,String professinol);

    //添加学生
    int saveStu(Student student);

    //修改学生信息
    int updateStu(Student student);

    //删除
    int delStu(Integer id);
}
