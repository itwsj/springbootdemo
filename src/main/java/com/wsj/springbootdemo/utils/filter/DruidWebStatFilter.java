package com.wsj.springbootdemo.utils.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 项目名称：DruidWebStatFilter;
 * 类 名 称：DruidWebStatFilter;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 22:02;
 *
 * @version：1.0
 **/
@WebFilter(filterName = "druidWebStatFilter", urlPatterns =
        "/*", initParams = {@WebInitParam(name = "exclusions", value
        = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
public class DruidWebStatFilter extends WebStatFilter {
}
