package com.wry.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

    private String status;

    private String salt;

    private String email;

    private String avatar;
    
    //原密码
    private String rpassword;

    private List<String> permsList;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                '}'+"\n";
    }
}