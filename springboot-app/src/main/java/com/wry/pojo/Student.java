package com.wry.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String stuname;  //学生姓名

    private String stuno;  //学号

    private String professinol; //专业

    private String grade; //年级

    private String sex;  //性别

    private String gpa;  //绩点

    private String phone; //联系方式

    private Subject name; //课程名称

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuname='" + stuname + '\'' +
                ", stuno='" + stuno + '\'' +
                ", professinol='" + professinol + '\'' +
                ", grade='" + grade + '\'' +
                ", sex='" + sex + '\'' +
                ", gpa='" + gpa + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}