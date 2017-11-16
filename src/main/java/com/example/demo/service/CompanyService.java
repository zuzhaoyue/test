package com.example.demo.service;

import com.example.demo.dao.CompanyRepository;
import com.example.demo.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zuzhaoyue on 17/11/15.
 */
@Component
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PersonService personService;

    @Transactional
    public void insert(){
        Company company = new Company();
        company.setName("ags");
        company.setNum(3L);
        companyRepository.save(company);
    }
    @Transactional
    public void add(){
        try{
            this.insert();
            personService.insertTwoPerson();
        }catch (Exception e){
            e.printStackTrace();
//            throw  e;

        }
    }
}
