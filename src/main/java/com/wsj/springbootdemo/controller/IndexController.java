package com.wsj.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 项目名称：IndexController;
 * 类 名 称：IndexController;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/2/15 16:41;
 *
 * @version：0.1;
 **/
@RestController
@RequestMapping("/wsj")
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/index")
    public String index(){
        logger.info("哈哈哈哈哈");
        return "hello word";
    }
}
