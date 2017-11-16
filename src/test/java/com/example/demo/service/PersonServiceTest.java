package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zuzhaoyue on 17/9/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class PersonServiceTest {
    @Autowired
    private PersonService personService;

    @Test
    public void insertTwoPerson() throws Exception {
        personService.insertTwoPerson();

    }
    @Test
    public void insert() throws Exception {
        try {
            personService.insert();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void insertT() throws Exception {
        try {
            personService.insertT();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void insertTC() throws Exception {
        try {
            personService.insertTC();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void insert2(){
        personService.insert();
    }
    @Test
    public void getPerson() throws Exception {


    }

}