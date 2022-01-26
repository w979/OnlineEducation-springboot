package com.wry.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wry.pojo.Subject;
import com.wry.pojo.Teacher;
import com.wry.service.ISubjectService;
import com.wry.service.ITeacherService;
import com.wry.utils.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TeacherController {
    @Resource
    private ITeacherService teacherService;

    @Resource
    private ISubjectService subjectService;

    /**
     * 讲师列表+条件查询
     * @param pageNum
     * @param pageSize
     * @param name
     * @return
     */
    @GetMapping("/teacher/query")
    public ResponseResult<Object> queryTeacher(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize",required = false,defaultValue = "5")Integer pageSize,
                                               @RequestParam(value = "name",required = false,defaultValue = "") String name){
        PageHelper.startPage(pageNum, pageSize);
        List<Teacher> teacherList = teacherService.findTeacherByName(name);
        PageInfo<Teacher> pageInfo = new PageInfo<>(teacherList);
        if (teacherList.size()>0){
            return  new ResponseResult<>(200,"OK",pageInfo);
        }else {
            return  new ResponseResult<>(4002,"没有查询到相关数据哦~");
        }
    }

    /**
     * 跳转添加页面，显示出添加所需科目列表
     */
    @GetMapping("/teacher/subject")
    public ResponseResult<Object> jumpSave(){
        List<Subject> subjectList = subjectService.findSubject();
        if (subjectList.size()>0){
            return  new ResponseResult<>(200,"科目列表",subjectList);
        }else {
            return  new ResponseResult<>(4003,"未查询到科目列表",subjectList);
        }
    }

    /**
     * 判断此用户是否有添加讲师权限
     * @return
     */
    @GetMapping("/teacher/showAdd")
    @PreAuthorize("hasAuthority('teacher:add')")
    public ResponseResult<Void> showAdd(){
        return  new ResponseResult<>(200,"有添加权限ok");
    }

    /**
     * 添加讲师
     */
    @PostMapping("/teacher/add")
    public ResponseResult<Object> saveTeacher(@RequestBody Teacher teacher){
        int n = teacherService.saveTeacher(teacher);
        if (n>0){
            return  new ResponseResult<>(200,"添加讲师成功");
        }else {
            return  new ResponseResult<>(4004,"添加讲师失败");
        }
    }

    /**
     * 判断此用户是否有修改讲师权限
     * @return
     */
    @GetMapping("/teacher/showUpdate")
    @PreAuthorize("hasAuthority('teacher:update')")
    public ResponseResult<Void> showUpdate(){
        return  new ResponseResult<>(200,"有修改权限ok");
    }

    /**
     * 修改讲师
     */
    @PostMapping("/teacher/update")
    public ResponseResult<Object> updateTeacher(@RequestBody Teacher teacher){
        int n = teacherService.updateTeacher(teacher);
        if (n>0){
            return  new ResponseResult<>(200,"修改成功");
        }else {
            return  new ResponseResult<>(4005,"修改失败");
        }
    }

    /**
     * 删除讲师
     */
    @GetMapping("/teacher/delete")
    @PreAuthorize("hasAuthority('teacher:delete')")
    public ResponseResult<Void> deleteTeacher(@RequestParam("id") Integer id){
        int n = teacherService.delTeacher(id);
        if (n>0){
            return  new ResponseResult<>(200,"删除成功");
        }else {
            return  new ResponseResult<>(4006,"删除失败,请重试");
        }
    }
}

