package com.example.demo.dao;

import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zuzhaoyue on 17/11/15.
 */
public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
