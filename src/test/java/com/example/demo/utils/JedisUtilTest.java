package com.example.demo.utils; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
* JedisUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 13, 2017</pre> 
* @version 1.0 
*/ 
@RunWith(SpringRunner.class) // SpringJUnitæ¯æï¼ç±æ­¤å¼å¥Spring-Testæ¡æ¶æ¯æï¼
@SpringBootTest
public class JedisUtilTest {


@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: get(String key) 
* 
*/ 
@Test
public void testGet() throws Exception { 
//TODO: Test goes here...
    Object a = JedisUtil.get("a");
    System.out.println(a);

} 


/** 
* 
* Method: close(Jedis jedis) 
* 
*/ 
@Test
public void testClose() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = JedisUtil.getClass().getMethod("close", Jedis.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
