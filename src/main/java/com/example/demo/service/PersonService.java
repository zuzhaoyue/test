package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zuzhaoyue on 17/9/2.
 */
@Component
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public Person insertTwoPerson(){
        Person person = new Person();
        person.setAge("12");
        person.setName("m");
        personRepository.save(person);
        Person person1 = new Person();
        person1.setAge("16");
        person1.setName("mmjjjl");
        return personRepository.save(person1);

    }


}
