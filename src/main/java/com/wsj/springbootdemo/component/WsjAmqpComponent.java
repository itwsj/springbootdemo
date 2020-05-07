//package com.wsj.springbootdemo.component;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * 项目名称：WsjAmqpComponent;
// * 类 名 称：WsjAmqpComponent;
// * 类 描 述：TODO ;
// * 创 建 人：Angus;
// * 创建时间：2020/5/7 15:59;
// *
// * @version：1.0
// **/
//@Component
//public class WsjAmqpComponent {
//    @Autowired
//    private AmqpTemplate amqpTemplate;
//
//    public void send(String msg) {
//        this.amqpTemplate.convertAndSend("wsj.queue", msg);
//    }
//
//    @RabbitListener(queues = "wsj.queue")
//    public void receiveQueue(String text) {
//        System.out.println("接受到：" + text);
//    }
//
//}
//
