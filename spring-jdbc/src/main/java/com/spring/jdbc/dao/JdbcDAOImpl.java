package com.spring.jdbc.dao;

import com.spring.jdbc.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class JdbcDAOImpl implements JdbcDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Account> getAccount() {
        return jdbcTemplate.query("select * from account",new AccountMapper());
    }
}
