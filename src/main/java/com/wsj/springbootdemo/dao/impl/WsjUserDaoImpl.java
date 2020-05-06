package com.wsj.springbootdemo.dao.impl;

import com.wsj.springbootdemo.bean.WsjUser;
import com.wsj.springbootdemo.dao.WsjUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 项目名称：WsjUserDaoImpl;
 * 类 名 称：WsjUserDaoImpl;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/6 23:44;
 *
 * @version：1.0
 **/
@Service
public class WsjUserDaoImpl implements WsjUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(WsjUser wsjUser) {
        String sql = "insert into wsj_user (name, create_time) values (?, ?)";
        return  jdbcTemplate.update(sql,  wsjUser.getName(),
                wsjUser.getCreateTime());
    }
    @Override
    public int deleteById(int id) {
        String sql = "delete from wsj_user where id=?";
        return jdbcTemplate.update(sql, id);
    }
    @Override
    public int updateById(WsjUser wsjUser) {
        String sql = "update wsj_user set name=?, create_time=? where id=?";
        return  jdbcTemplate.update(sql,  wsjUser.getName(),
                wsjUser.getCreateTime(), wsjUser.getId());
    }
    @Override
    public WsjUser selectById(int id) {
        String sql = "select * from wsj_user where id=?";
        return jdbcTemplate.queryForObject(sql, new RowMapper<WsjUser>() {
            @Override
            public WsjUser mapRow(ResultSet rs, int rowNum) throws SQLException {
                WsjUser wsjUser = new WsjUser();
                wsjUser.setId(rs.getInt("id"));
                wsjUser.setName(rs.getString("name"));
                wsjUser.setCreateTime(rs.getDate("create_time"));
                return wsjUser;
            }
        }, id);
    }
}
