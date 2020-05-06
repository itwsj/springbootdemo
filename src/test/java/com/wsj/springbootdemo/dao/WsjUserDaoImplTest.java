package com.wsj.springbootdemo.dao;

import com.wsj.springbootdemo.bean.WsjUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class WsjUserDaoImplTest {

    @Autowired
    private WsjUserDao wsjUserDao;

    @Test
    void insert() {
        WsjUser wsjUser = new WsjUser();
        wsjUser.setName("测试2");
        wsjUser.setCreateTime(new Date());
        int result = wsjUserDao.insert(wsjUser);
        System.out.println(result);
    }

    @Test
    void deleteById() {
        int result = wsjUserDao.deleteById(1);
        System.out.println(result);
    }

    @Test
    void updateById() {
        WsjUser wsjUser = new WsjUser();
        wsjUser.setId(2);
        wsjUser.setName("测试 2");
        wsjUser.setCreateTime(new Date());
        int result = wsjUserDao.updateById(wsjUser);
        System.out.println(result);
    }

    @Test
    void selectById() {
        WsjUser result = wsjUserDao.selectById(2);
        System.out.println(result);
    }
}