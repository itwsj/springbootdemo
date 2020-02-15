package com.wsj.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

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

    @RequestMapping("/index")
    public String index(){
        return "hello word";
    }
}
