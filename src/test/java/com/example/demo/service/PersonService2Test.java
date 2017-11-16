package com.example.demo.service; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/** 
* PersonService2 Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 15, 2017</pre> 
* @version 1.0 
*/ 
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnitæ¯æï¼ç±æ­¤å¼å¥Spring-Testæ¡æ¶æ¯æï¼
@SpringBootTest
// æå®æä»¬Sp
public class PersonService2Test {
    @Autowired
    private PersonService2 personService2;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insertTwoPerson() 
* 
*/ 
@Test
public void testInsertTwoPerson() throws Exception { 
//TODO: Test goes here...
    personService2.insertTwoPerson();//会回滚,不会插入数据
} 

/** 
* 
* Method: insert() 
* 
*/ 
@Test
public void testInsert() throws Exception { 
//TODO: Test goes here...
    personService2.insert();//会回滚,不会插入数据
} 


} 
