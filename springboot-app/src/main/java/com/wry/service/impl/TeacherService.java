package com.wry.service.impl;

import com.wry.dao.TeacherDao;
import com.wry.pojo.Teacher;
import com.wry.service.ITeacherService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class TeacherService implements ITeacherService {

    @Autowired
    private TeacherDao teacherDao;

    /**
     * 讲师列表
     * @return
     */
    @Override
    public List<Teacher> findTeacherByName(String name) {
        return teacherDao.queryTeacher(name);
    }


    /**
     * 添加讲师
     * @param teacher
     * @return
     */
    @Override
    public int saveTeacher(Teacher teacher) {
        return teacherDao.insertSelective(teacher);
    }

    /**
     * 修改讲师
     * @param teacher
     * @return
     */
    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherDao.updateByPrimaryKeySelective(teacher);
    }

    /**
     * 删除讲师
     * @param id
     * @return
     */
    @Override
    public int delTeacher(Integer id) {
        return teacherDao.deleteByPrimaryKey(id);
    }

    /**
     * 查询所有讲师
     * @return
     */
    @Override
    public List<Teacher> findTeacher() {
        return teacherDao.queryAllTeacher();
    }


}
