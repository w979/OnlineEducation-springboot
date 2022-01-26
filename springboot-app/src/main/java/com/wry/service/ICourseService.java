package com.wry.service;

import com.wry.pojo.Course;

import java.util.List;

public interface ICourseService {
    //查询所有课程信息
    List<Course> findCourse(String status);

    //添加选课信息
    int saveCourse(Course course);

    //修改选课信息
    int updateCourse(Course course);

    //删除选课信息
    int delCourse(Integer id);
}
