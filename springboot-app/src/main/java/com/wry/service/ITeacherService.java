package com.wry.service;

import com.wry.pojo.Teacher;

import java.util.List;

public interface ITeacherService {
    //讲师列表
    List<Teacher> findTeacherByName(String name);

    //添加讲师
    int saveTeacher(Teacher teacher);

    //修改讲师
    int updateTeacher(Teacher teacher);

    //删除讲师
    int delTeacher(Integer id);

    //查询所有讲师
    List<Teacher> findTeacher();

}
