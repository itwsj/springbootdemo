package com.wsj.springbootdemo.component;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WsjAmqpComponentTest {

    @Autowired
    private WsjAmqpComponent wsjAmqpComponent;
    @Test
    void send() {
        wsjAmqpComponent.send("hello world");
    }
}