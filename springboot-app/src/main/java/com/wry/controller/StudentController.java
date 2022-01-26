package com.wry.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wry.pojo.Student;
import com.wry.pojo.Subject;
import com.wry.service.IStudentService;
import com.wry.service.ISubjectService;
import com.wry.utils.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {

    @Resource
    private IStudentService studentService;

    @Resource
    private ISubjectService subjectService;

    /**
     * 学生列表+多条件查询
     *
     * @param pageNum
     * @param pageSize
     * @param stuname
     * @param grade
     * @param professinol
     * @return
     */
    @GetMapping("/student/list")
    public ResponseResult<Object> queryStu(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
                                           @RequestParam(value = "stuname", required = false, defaultValue = "") String stuname,
                                           @RequestParam(value = "grade", required = false, defaultValue = "") String grade,
                                           @RequestParam(value = "professinol", required = false, defaultValue = "") String professinol) {
        PageHelper.startPage(pageNum, pageSize);
        List<Student> studentList = studentService.findAllStu(stuname, grade, professinol);
        PageInfo<Student> pageInfo = new PageInfo<>(studentList);
        if (studentList.size() > 0) {
            return new ResponseResult<>(200, "OK", pageInfo);
        } else {
            return new ResponseResult<>(4002, "没有查询到相关数据哦~");
        }
    }

    /**
     * 查询学生选课信息
     *
     * @param id
     * @return
     */
    @GetMapping("/student/personal")
    public ResponseResult<Object> showPersonal(@RequestParam("id") Integer id) {
        List<Subject> subjects = subjectService.getSubByUserId(id);
        return new ResponseResult<>(200, "ok", subjects);
    }

    /**
     * 判断此用户是否有添加用户的权限
     *
     * @return
     */
    @GetMapping("/student/showAdd")
    @PreAuthorize("hasAuthority('student:add')")
    public ResponseResult<Void> showAdd() {
        return new ResponseResult<>(200, "有添加用户权限ok");
    }

    /**
     * 添加学生
     */
    @PostMapping("/student/add")
    public ResponseResult<Object> saveUser(@RequestBody Student student) {
        int n = studentService.saveStu(student);
        if (n > 0) {
            return new ResponseResult<>(200, "添加学生成功");
        } else {
            return new ResponseResult<>(4004, "添加学生失败");
        }
    }

    /**
     * 判断此用户是否有修改权限
     *
     * @return
     */
    @GetMapping("/student/showUpdate")
    @PreAuthorize("hasAuthority('student:update')")
    public ResponseResult<Void> showUpdate() {
        return new ResponseResult<>(200, "有修改用户权限ok");
    }

    /**
     * 修改学生信息
     */
    @PostMapping("/student/update")
    public ResponseResult<Object> updateTeacher(@RequestBody Student student) {
        int n = studentService.updateStu(student);
        if (n > 0) {
            return new ResponseResult<>(200, "修改学生信息成功");
        } else {
            return new ResponseResult<>(4005, "修改学生信息失败");
        }
    }


    /**
     * 删除学生信息
     */
    @GetMapping("/student/delete")
    @PreAuthorize("hasAuthority('student:delete')")
    public ResponseResult<Void> deleteUser(@RequestParam("id") Integer id) {
        //1.删除与课程关联表的学生
        //2.删除学生表的学生信息
        int n = studentService.delStu(id);
        if (n > 0) {
            return new ResponseResult<>(200, "删除学生成功");
        } else {
            return new ResponseResult<>(4006, "删除学生失败,请重试");
        }
    }
}
