package com.wry.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String education;

    private String career;

    private String isfamous;

    private String avatar;

    private Integer subjectid;

    private String status;

    private Subject subject;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", career='" + career + '\'' +
                ", isfamous='" + isfamous + '\'' +
                ", avatar='" + avatar + '\'' +
                ", subjectid=" + subjectid +
                ", status='" + status + '\'' +
                '}'+"\n";
    }
}