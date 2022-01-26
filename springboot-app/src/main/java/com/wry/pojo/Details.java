package com.wry.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
@Data
public class Details implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String name;

    private String ip;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date operatedate; //操作时间

    private String msg; //行为

    private String status; //状态

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", operatedate=" + operatedate +
                ", msg='" + msg + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}