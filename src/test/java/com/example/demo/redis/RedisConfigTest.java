package com.example.demo.redis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
* RedisConfig Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 19, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConfigTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate ;

    @Test
    public void test() throws Exception {
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void testObj() throws Exception {
        String user = "zhaoyue.zu";
        ValueOperations<String, String> operations=redisTemplate.opsForValue();
        operations.set("com.neox", user);
        operations.set("com.neo.f", user,10, TimeUnit.SECONDS);//设置存在时间为10秒
        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists=redisTemplate.hasKey("com.neo.f");
        if(exists){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: keyGenerator() 
* 
*/ 
@Test
public void testKeyGenerator() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: cacheManager(RedisTemplate redisTemplate) 
* 
*/ 
@Test
public void testCacheManager() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: redisTemplate(RedisConnectionFactory factory) 
* 
*/ 
@Test
public void testRedisTemplate() throws Exception { 
//TODO: Test goes here... 
} 


} 
