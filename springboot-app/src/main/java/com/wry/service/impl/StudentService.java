package com.wry.service.impl;

import com.wry.dao.StudentDao;
import com.wry.dao.SubjectDao;
import com.wry.pojo.Student;
import com.wry.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
 * 学生管理业务类
 */
@Service
@Transactional
public class StudentService implements IStudentService {
    @Resource
    private StudentDao studentDao;

    @Resource
    private SubjectDao subjectDao;

    /**
     * 查询所有学生信息
     * @param stuname
     * @param grade
     * @param professinol
     * @return
     */
    @Override
    public List<Student> findAllStu(String stuname, String grade, String professinol) {
        return studentDao.queryStu(stuname, grade, professinol);
    }

    /**
     * 添加学生
     * @param student
     * @return
     */
    @Override
    public int saveStu(Student student) {
        return studentDao.insertSelective(student);
    }

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    @Override
    public int updateStu(Student student) {
        return studentDao.updateByPrimaryKeySelective(student);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int delStu(Integer id) {
        int n = subjectDao.delSubStu(id);
        if (n >= 0){
            return studentDao.deleteByPrimaryKey(id);
        }
        return -1;
    }

}
