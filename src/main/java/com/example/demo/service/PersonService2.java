package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zuzhaoyue on 17/11/15.
 */
@Component
public class PersonService2 {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonService personService;

    @Transactional
    public void insertOnePerson(){
        Person person = new Person();
        person.setAge("111");
        person.setName("111");
         personRepository.save(person);
    }
    @Transactional
    public Person insertTwoPerson(){
        return personService.insertTwoPerson();

    }
    @Transactional
    public void insert(){
        try {
            this.insertOnePerson();
            personService.insertTwoPerson();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
