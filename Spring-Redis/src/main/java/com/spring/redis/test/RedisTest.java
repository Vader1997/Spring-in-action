package com.spring.redis.test;

import com.spring.redis.config.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedisConfig.class)
public class RedisTest {
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void test(){
//        redisTemplate.opsForValue().set("name","赵文博");
//        redisTemplate.opsForList().leftPushAll("info","赵文博","97","22");
        System.out.println(redisTemplate.opsForValue().get("name"));
        System.out.println(redisTemplate.opsForList().range("info",0,2));

    }
}
