package com.hsf.redis.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author hsf
 * @create 2023-02-06 22:30
 */
public class JedisDemo01 {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("192.168.157.100", 6379);
        //测试
        String value = jedis.ping();
        System.out.println(value);
    }
}
