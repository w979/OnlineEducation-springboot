package com.wry.service.impl;

import com.wry.dao.SubjectDao;
import com.wry.pojo.Subject;
import com.wry.service.ISubjectService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class SubjectService implements ISubjectService {
    @Resource
    private SubjectDao subjectDao;

    /**
     * 查询所有课程
     * @return
     */
    @Override
    public List<Subject> findSubject() {
        SelectDSLCompleter completer = c->c;
        return subjectDao.select(completer);
    }

    /**
     * 根据id查询学生选修课程
     * @param studentid
     * @return
     */
    @Override
    public List<Subject> getSubByUserId(Integer studentid) {
        return subjectDao.getSubByUserId(studentid);
    }
}
