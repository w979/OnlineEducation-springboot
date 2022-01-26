package com.wry.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer sort;

    private Integer coursenum;

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", coursenum=" + coursenum +
                '}'+"\n";
    }
}