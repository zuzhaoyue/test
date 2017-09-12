package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zuzhaoyue on 17/9/2.
 */

public interface PersonRepository extends JpaRepository<Person,Integer> {
    //通过年龄找人
    public List<Person> findByAge(String age);

    /*@Query("select p.name from Person where p.name=?1")
     Person withNameAndAddressQuery(String name);*/
}
