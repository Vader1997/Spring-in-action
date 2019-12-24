package com.spring.mybatis.test;

import com.spring.mybatis.config.MybatisConfig;
import com.spring.mybatis.domain.Account;
import com.spring.mybatis.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MybatisConfig.class)
public class MybatisTest {
    @Autowired
    AccountMapper accountMapper;
    @Test
    public void test(){
        Account account = accountMapper.findById(1);
        System.out.println(account.toString());
    }
}
