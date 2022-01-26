package com.wry.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
@Data
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String describes; //课程简介

    private Integer teacherid; //对应老师id

    private Integer subjectid; //课程id

    private Integer pnum; //可选人数

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date electivedate; //开选时间

    private String status; //状态：y可选  n不可选

    private Teacher teacher;
    private Subject subject;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", describe='" + describes + '\'' +
                ", teacherid=" + teacherid +
                ", pnum=" + pnum +
                ", electivedate=" + electivedate +
                ", subjectid=" + subjectid +
                '}';
    }

}