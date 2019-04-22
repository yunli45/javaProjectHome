package com.example.ssmdemo.vo;

import java.io.Serializable;

public class Emp implements Serializable {
    private Integer id;
    private String ename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
