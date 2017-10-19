package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by zuzhaoyue on 17/9/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getAllPersons() throws Exception {

    }

    @Test
    public void get() throws Exception {


    }

    @Test
    public void get1() throws Exception {

    }

    @Test
    public void getPersonByList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/person/1"))
                .andExpect(MockMvcResultMatchers.status().isOk());
//        .andExpect(MockMvcResultMatchers.content().json("123"));

    }

    @Test
    public void insertPerson() throws Exception {

    }

    @Test
    public void updatePerson() throws Exception {

    }

}