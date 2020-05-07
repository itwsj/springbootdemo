package com.wsj.springbootdemo.controller;

import com.wsj.springbootdemo.component.WsjRedisComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WsjRedisComponentTest {

    @Autowired
    private WsjRedisComponent wsjRedisComponent;

    @Test
    public void set() {
        wsjRedisComponent.set("wsj", "hello world");
    }
    @Test
    public void get() {
        System.out.println(wsjRedisComponent.get("wsj"));
    }
    @Test
    public void del() {
        wsjRedisComponent.del("wsj");
    }
}