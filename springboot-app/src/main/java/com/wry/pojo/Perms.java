package com.wry.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Perms implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String code;

    private String link;

    private Integer parentid;

    private String type;

    private String status;

    private String percode;

    private String icon;

    //子权限集合
    private List<Perms> childrensList;

    @Override
    public String toString() {
        return "Perms{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", link='" + link + '\'' +
                ", parentid=" + parentid +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", percode='" + percode + '\'' +
                ", icon='" + icon + '\'' +
                '}'+"\n";
    }
}