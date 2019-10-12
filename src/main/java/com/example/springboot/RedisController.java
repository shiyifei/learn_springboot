package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/redis/test")
    public String redis() {
        redisTemplate.opsForValue().set("aaa", "what are you doing now?");
        return redisTemplate.opsForValue().get("aaa");
    }

    @RequestMapping("/redis/get/{key}")
    private String get(@PathVariable("key") String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @RequestMapping("redis/set/{key}/{value}")
    private Boolean set(@PathVariable("key") String key, @PathVariable("value") String value) {
        boolean flag = true;
        try{
            redisTemplate.opsForValue().set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

}
