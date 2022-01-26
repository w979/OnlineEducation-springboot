package com.wry.service.impl;

import com.wry.dao.CourseDao;
import com.wry.pojo.Course;
import com.wry.service.ICourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程管理业务类
 */
@Service
@Transactional
public class CourseService implements ICourseService {
    @Resource
    private CourseDao courseDao;

    /**
     * 查询所有课程信息
     * @return
     */
    @Override
    public List<Course> findCourse(String status) {
        return courseDao.queryCourse(status);
    }

    /**
     * 添加选课信息
     * @param course
     * @return
     */
    @Override
    public int saveCourse(Course course) {
        return courseDao.insertSelective(course);
    }

    /**
     * 修改选课信息
     * @param course
     * @return
     */
    @Override
    public int updateCourse(Course course) {
        return courseDao.updateByPrimaryKeySelective(course);
    }

    /**
     * 删除选课信息
     * @param id
     * @return
     */
    @Override
    public int delCourse(Integer id) {
        return courseDao.deleteByPrimaryKey(id);
    }
}
