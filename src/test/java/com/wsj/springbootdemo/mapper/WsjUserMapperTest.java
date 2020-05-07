package com.wsj.springbootdemo.mapper;

import com.wsj.springbootdemo.bean.WsjUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WsjUserMapperTest {

    @Autowired
    private WsjUserMapper mapper;

    @Test
    void insert() {
        WsjUser wsjUser = new WsjUser();
        wsjUser.setName("测试22");
        wsjUser.setCreateTime(new Date());
        int result = mapper.insert(wsjUser);
        System.out.println(result);
    }

    @Test
    void selectByPrimaryKey() {
        WsjUser result = mapper.selectByPrimaryKey(2);
        System.out.println(result);
    }
}