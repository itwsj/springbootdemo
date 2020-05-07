package com.wsj.springbootdemo.dao;

import com.wsj.springbootdemo.bean.WsjUserLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

@SpringBootTest
class WsjUserLogDaoTest {

    @Autowired
    private WsjUserLogDao wsjUserLogDao;

    @Test
    public void insert() {
        WsjUserLog entity = new WsjUserLog();
        entity.setUserName("测试1");
        entity.setUserIp("192.168.0.1");
        entity.setCreateTime(new Date());
        wsjUserLogDao.save(entity);
    }
    @Test
    public void delete() {
        wsjUserLogDao.deleteById(1);
    }
    @Test
    public void update() {
        WsjUserLog entity = new WsjUserLog();
        entity.setId(2);
        entity.setUserName("测试12");
        entity.setUserIp("192.168.0.1");
        entity.setCreateTime(new Date());
        wsjUserLogDao.save(entity);
    }
    @Test
    public void select() {
        Optional<WsjUserLog> result = wsjUserLogDao.findById(1);
        System.out.println(result);
    }
}