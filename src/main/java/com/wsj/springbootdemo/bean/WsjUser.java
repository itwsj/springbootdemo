package com.wsj.springbootdemo.bean;

import java.util.Date;

/**
 * 项目名称：WsjUser;
 * 类 名 称：WsjUser;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/6 23:31;
 *
 * @version：1.0
 **/
public class WsjUser {
    private int id;
    private String name;
    private Date createTime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Override
    public String toString() {
        return "RoncooUser [id=" + id + ", name=" + name + ", createTime=" + createTime
                + "]";
    }
}
