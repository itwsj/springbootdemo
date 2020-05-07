package com.wsj.springbootdemo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 项目名称：WsjUserLog;
 * 类 名 称：WsjUserLog;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 0:32;
 *
 * @version：1.0
 **/
@Entity
public class WsjUserLog {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private Date createTime;
    @Column
    private String userName;
    @Column
    private String userIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Override
    public String toString() {
        return "WsjUserLog{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", userName='" + userName + '\'' +
                ", userIp='" + userIp + '\'' +
                '}';
    }
}
