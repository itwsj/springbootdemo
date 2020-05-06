package com.wsj.springbootdemo.dao;

import com.wsj.springbootdemo.bean.WsjUser;

/**
 * 项目名称：WsjUserDao;
 * 类 名 称：WsjUserDao;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/6 23:42;
 *
 * @version：1.0
 **/

public interface WsjUserDao {
    int insert(WsjUser wsjUser);
    int deleteById(int id);
    int updateById(WsjUser wsjUser);
    WsjUser selectById(int id);
}
