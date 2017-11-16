package com.example.demo.service;


import com.example.demo.bean.Message;
import com.example.demo.utils.JedisUtil;
import com.example.demo.utils.ObjectUtil;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by zuzhaoyue on 17/11/13.
 * 实现消息队列
 */
@Component
public class RedisService {
    public static byte[] redisKey = "zzy-key".getBytes();

    static {
        try {
            System.out.println("准备执行init");
            init();
            System.out.println("执行init结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void init() throws IOException {
        for (int i = 0; i < 10000; i++) {
            Message message = new Message(i, "这是第" + i + "个内容");
            byte[] key = redisKey;
            byte[] value = ObjectUtil.object2Bytes(message);
            JedisUtil.lpush(key, value);//最开始的时候从左边push进名叫【zzy-key】的key里
        }

    }
    public static void main(String[] args) {
        try {
            System.out.println("准备执行pop");
            pop();//从名为[zzy-key]的key的list右边push出来
            System.out.println("执行pop结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void pop() throws Exception {
        byte[] bytes = JedisUtil.rpop(redisKey);
        Message msg = (Message) ObjectUtil.bytes2Object(bytes);
        if (msg != null) {
            System.out.println(msg.getId() + "----" + msg.getContent());
        }
    }

}
