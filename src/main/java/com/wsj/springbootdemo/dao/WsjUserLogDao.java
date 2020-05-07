package com.wsj.springbootdemo.dao;

import com.wsj.springbootdemo.bean.WsjUserLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 项目名称：WsjUserLogDao;
 * 类 名 称：WsjUserLogDao;
 * 类 描 述：jpa调用 ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 10:24;
 *
 * @version：1.0
 **/
public interface WsjUserLogDao extends JpaRepository<WsjUserLog, Integer> {

}
