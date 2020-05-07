package com.wsj.springbootdemo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableJms
//@EnableRabbit
@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
