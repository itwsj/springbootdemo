package com.wsj.springbootdemo.utils.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * 项目名称：DruidStatViewServlet;
 * 类 名 称：DruidStatViewServlet;
 * 类 描 述：监控 ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 22:00;
 *
 * @version：1.0
 **/
@WebServlet(urlPatterns = {"/druid/*"}, initParams =
        {@WebInitParam(name = "loginUsername", value = "wsj"),
                @WebInitParam(name = "loginPassword", value = "wsj")})
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 1L;
}