package com.spring.transaction1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDaoImpl implements TransactionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void out(String form, double money) {
        String sql="update account set money=money-? where name=?";
       jdbcTemplate.update(sql,money,form);
    }

    @Override
    public void in(String to, double money) {
        String sql="update account set money=money+? where name=?";
        jdbcTemplate.update(sql,money,to);
    }
}
