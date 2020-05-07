//package com.wsj.springbootdemo.component;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.jms.core.JmsMessagingTemplate;
//import org.springframework.stereotype.Component;
//
//import javax.jms.Queue;
//
///**
// * 项目名称：WsjJmsComponent;
// * 类 名 称：WsjJmsComponent;
// * 类 描 述：TODO ;
// * 创 建 人：Angus;
// * 创建时间：2020/5/7 15:36;
// *
// * @version：1.0
// **/
//@Component
//public class WsjJmsComponent {
//
//    @Autowired
//    private JmsMessagingTemplate jmsMessagingTemplate;
//
//    @Autowired
//    private Queue queue;
//
//    public void send(String msg) {
//        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
//    }
//
//    @JmsListener(destination = "wsj.queue")
//    public void receiveQueue(String text) {
//        System.out.println("接受到：" + text);
//    }
//
//}
//
