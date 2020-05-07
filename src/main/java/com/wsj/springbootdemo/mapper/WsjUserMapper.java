package com.wsj.springbootdemo.mapper;

import com.wsj.springbootdemo.bean.WsjUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import static java.sql.JDBCType.TIMESTAMP;
import static org.apache.ibatis.type.JdbcType.VARCHAR;

/**
 * 项目名称：WsjUserMapper;
 * 类 名 称：WsjUserMapper;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 20:34;
 *
 * @version：1.0
 **/
@Mapper
public interface WsjUserMapper {
    @Insert(value = "insert into wsj_user (name, create_time) values (#{name,jdbcType=VARCHAR},#{createTime,jdbcType=TIMESTAMP})")
    int insert(WsjUser record);

    @Select(value = "select id, name, create_time from wsj_user where id = #{id,jdbcType=INTEGER}")
    @Results(value = { @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
    WsjUser selectByPrimaryKey(Integer id);

}
