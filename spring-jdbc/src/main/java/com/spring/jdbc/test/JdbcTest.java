package com.spring.jdbc.test;

import com.spring.jdbc.config.JdbcConfig;
import com.spring.jdbc.dao.JdbcDAO;
import com.spring.jdbc.dao.JdbcDAOImpl;
import com.spring.jdbc.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JdbcConfig.class)
public class JdbcTest {
    @Autowired
    JdbcDAO jdbcDAO;
    @Test
    public void show(){
        List<Account> list = jdbcDAO.getAccount();
        for (Account account:list) {
            System.out.println(account.toString());
        }
    }
}
