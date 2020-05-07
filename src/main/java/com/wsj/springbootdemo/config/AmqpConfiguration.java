package com.wsj.springbootdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 项目名称：AmqpConfiguration;
 * 类 名 称：AmqpConfiguration;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 15:58;
 *
 * @version：1.0
 **/
@Configuration
public class AmqpConfiguration {

    @Bean
    public Queue queue() {
        return new Queue("wsj.queue");
    }

}

