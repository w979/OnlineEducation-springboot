package com.wry.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wry.pojo.Course;
import com.wry.pojo.Subject;
import com.wry.pojo.Teacher;
import com.wry.service.ICourseService;
import com.wry.service.ISubjectService;
import com.wry.service.ITeacherService;
import com.wry.utils.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {
    @Resource
    private ICourseService courseService;

    @Resource
    private ISubjectService subjectService;

    @Resource
    private ITeacherService teacherService;

    /**
     * 课程列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/course/list")
    public ResponseResult<Object> queryUsers(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                             @RequestParam(value = "pageSize",required = false,defaultValue = "5")Integer pageSize,
                                             @RequestParam(value = "status",required = false,defaultValue = "") String status){
        PageHelper.startPage(pageNum, pageSize);
        List<Course> courseList = courseService.findCourse(status);
        PageInfo<Course> pageInfo = new PageInfo<>(courseList);
        if (courseList.size()>0){
            return  new ResponseResult<>(200,"OK",pageInfo);
        }else {
            return  new ResponseResult<>(4002,"没有查询到相关数据哦~");
        }
    }

    /**
     * 判断此用户是否有添加课程的权限
     * @return
     */
    @GetMapping("/course/showAdd")
    @PreAuthorize("hasAuthority('course:add')")
    public ResponseResult<Object> showAdd(){

        List<Subject> subjectList = subjectService.findSubject();
        List<Teacher> teacherList = teacherService.findTeacher();
        Map<String,Object> map = new HashMap<>();
        map.put("subjectList", subjectList);
        map.put("teacherList", teacherList);

        return  new ResponseResult<>(200,"有添加用户权限ok",map);
    }

    /**
     * 添加选课信息
     */
    @PostMapping("/course/add")
    public ResponseResult<Void> saveTeacher(@RequestBody Course course){
        int n = courseService.saveCourse(course);
        if (n>0){
            return  new ResponseResult<>(200,"添加选课信息成功");
        }else {
            return  new ResponseResult<>(4004,"添加选课信息失败");
        }
    }

    /**
     * 判断此用户是否有修改课程信息权限
     * @return
     */
    @GetMapping("/course/showUpdate")
    @PreAuthorize("hasAuthority('course:update')")
    public ResponseResult<Object> showUpdate(){
        List<Subject> subjectList = subjectService.findSubject();
        List<Teacher> teacherList = teacherService.findTeacher();
        Map<String,Object> map = new HashMap<>();
        map.put("subjectList", subjectList);
        map.put("teacherList", teacherList);
        return  new ResponseResult<>(200,"有修改权限ok",map);
    }

    /**
     * 修改讲师
     */
    @PostMapping("/course/update")
    public ResponseResult<Object> updateTeacher(@RequestBody Course course){
        int n = courseService.updateCourse(course);
        if (n>0){
            return  new ResponseResult<>(200,"修改选课信息成功");
        }else {
            return  new ResponseResult<>(4005,"修改选课信息失败");
        }
    }

    /**
     * 删除选课信息
     */
    @GetMapping("/course/delete")
    @PreAuthorize("hasAuthority('course:delete')")
    public ResponseResult<Void> deleteTeacher(@RequestParam("id") Integer id){
        int n = courseService.delCourse(id);
        if (n>0){
            return  new ResponseResult<>(200,"删除成功");
        }else {
            return  new ResponseResult<>(4006,"删除失败,请重试");
        }
    }
}
