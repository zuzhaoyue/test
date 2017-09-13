package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.exception.PersonException;
import com.example.demo.model.Person;
import com.example.demo.model.Result;
import com.example.demo.utils.ResultUtil;
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
    public Result getPerson(Integer id) throws Exception {
        Person person =  personRepository.findOne(id);
        if( Integer.parseInt(person.getAge() )< 6){
            throw new PersonException(101,"你还太小");
        }else if(Integer.parseInt(person.getAge() )> 76) {
            throw new PersonException(102,"你年经太大了");
        }else{
            return ResultUtil.success(person);
        }
    }


}
