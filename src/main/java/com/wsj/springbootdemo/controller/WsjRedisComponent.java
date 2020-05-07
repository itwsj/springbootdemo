package com.wsj.springbootdemo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
/**
 * 项目名称：WsjRedisComponent;
 * 类 名 称：WsjRedisComponent;
 * 类 描 述：redis测试;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 14:38;
 *
 * @version：1.0
 **/
@Component
public class WsjRedisComponent {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void set(String key, String value) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        if (!this.stringRedisTemplate.hasKey(key)) {
            ops.set(key, value);
            System.out.println("set key success");
        } else {
        // 存在则打印之前的 value 值
            System.out.println("this key = " + ops.get(key));
        }
    }
    public String get(String key) {
        return this.stringRedisTemplate.opsForValue().get(key);
    }
    public void del(String key) {
        this.stringRedisTemplate.delete(key);
    }
}
