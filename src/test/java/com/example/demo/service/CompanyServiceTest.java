package com.example.demo.service; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/** 
* CompanyService Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 15, 2017</pre> 
* @version 1.0 
*/ 
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnitæ¯æï¼ç±æ­¤å¼å¥Spring-Testæ¡æ¶æ¯æï¼
@SpringBootTest
public class CompanyServiceTest {
    @Autowired
    private CompanyService companyService;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insert() 
* 
*/ 
@Test
public void testInsert() throws Exception { 
//TODO: Test goes here...
    companyService.insert();

} 

/** 
* 
* Method: add() 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here...
    try {
        companyService.add();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
} 


} 
