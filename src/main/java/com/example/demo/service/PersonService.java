package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.enums.ResultEnum;
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
        person.setAge("222");
        person.setName("222");
        personRepository.save(person);
        Person person1 = new Person();
        person1.setAge("222");
        person1.setName("222222222");
        return personRepository.save(person1);

    }
    @Transactional
    public Person insertOnePerson(){
        Person person = new Person();
        person.setAge("111");
        person.setName("111");
        return personRepository.save(person);
    }
    //没有事务处理,数据会出错
    public void insert(){
        insertOnePerson();
        insertTwoPerson();
    }
    @Transactional
    public void insertT(){
        insertOnePerson();
        insertTwoPerson();
    }
    @Transactional
    public void insertTC(){
        try {
            insertOnePerson();
            insertTwoPerson();
        }catch (Exception e){
            throw e;
        }
    }
    public Result getPerson(Integer id) throws Exception {
        Person person =  personRepository.findOne(id);
        if( Integer.parseInt(person.getAge() )< 6){
            throw new PersonException(ResultEnum.TOO_LITTLE);
        }else if(Integer.parseInt(person.getAge() )> 76) {
            throw new PersonException(ResultEnum.TOO_OLD);
        }else{
            return ResultUtil.success(person);
        }
    }


}
