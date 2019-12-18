package com.spring.transaction2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionDaoImpl implements TransactionDao {
//    @Autowired
//    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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
