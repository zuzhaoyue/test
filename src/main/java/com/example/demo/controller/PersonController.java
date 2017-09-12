package com.example.demo.controller;

import com.example.demo.dao.PersonRepository;
import com.example.demo.service.PersonService;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zuzhaoyue on 17/9/2.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public List<Person> getAllPersons(){
        List result =  personRepository.findAll();
        return result;
    }

    @RequestMapping(value ={"/test2","/test3/{id}"} ,method = RequestMethod.GET)
//    @PostMapping("/test2")
    public String get(@PathVariable(value = "id")Integer id){
        return "hello" + id;
    }

    @RequestMapping(value ={"/test4","/test5/"} ,method = RequestMethod.GET)
//    @PostMapping("/test2")
    public String get1(@RequestParam(value = "id")Integer id){
        return "hello" + id;
    }
    @GetMapping("/person/{id}")
    public Person getPersonByList(@PathVariable("id")Integer id){
        return personRepository.findOne(id);
    }

    /*@GetMapping("/person/age/{age}")
    public List getPersonByAge(@PathVariable("age")String age){
        return personRepository.findByAge(age);
    }*/
    @PostMapping("/person")
    public Person insertPerson(@Param("name")String name,@Param("age")String age){
        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        return personRepository.save(person);
    }
    @PostMapping("/person/insert")
    public void updatePerson(){
        personService.insertTwoPerson();
    }
    /*@GetMapping("/test/{id}")
    public String test(@PathVariable("id") Integer aid){
        return "hello " + aid;
    }*/
}
