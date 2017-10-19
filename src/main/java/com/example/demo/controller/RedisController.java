package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zuzhaoyue on 17/9/25.
 */
@RestController
public class RedisController {
    private final Logger logger = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private void getRedis(){

    }

}
