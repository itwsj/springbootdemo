package com.wsj.springbootdemo.controller;

import com.wsj.springbootdemo.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


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
    @RequestMapping("/thymeleaf")
    public ModelAndView thymeleaf(){

        User user = new User();
        user.setName("wsj");
        user.setAge(100);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("/user/user.html");
        return mv;
    }




}
