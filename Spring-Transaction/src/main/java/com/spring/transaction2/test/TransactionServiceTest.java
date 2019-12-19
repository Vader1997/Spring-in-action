package com.spring.transaction2.test;

import com.spring.transaction2.service.TransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application2.xml")
public class TransactionServiceTest {
  @Autowired
  TransactionService transactionService;

    @Test
    public void test(){
        transactionService.trans("aaa","bbb",100);
    }
}