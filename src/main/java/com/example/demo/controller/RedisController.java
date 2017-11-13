package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by zuzhaoyue on 17/9/25.
 */
@RestController
public class RedisController {
    private final Logger logger = LoggerFactory.getLogger(RedisController.class);

    @RequestMapping("/getUser")
    @Cacheable(value = "user-zzy")
    public String getRedis(/*@RequestParam("name")String name*/){
        System.out.println("猜猜能不能成功~");
        return "aaa";

    }

    @RequestMapping("/session")
    public String testSession(HttpSession session){
        /*UUID uuid = (UUID) session.getAttribute("id");
        if(uuid == null){
            uuid = UUID.randomUUID();
        }
        session.setAttribute("uuid",uuid);*/
        return session.getId();
    }

}
