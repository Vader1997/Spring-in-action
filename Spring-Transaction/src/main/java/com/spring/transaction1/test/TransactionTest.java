package com.spring.transaction1.test;

import com.spring.transaction1.TransactionServiceProxy;
import com.spring.transaction1.config.TransactionConfig;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TransactionConfig.class)
public class TransactionTest {
    @Autowired
    @Qualifier("transactionService")
    TransactionServiceProxy transactionServiceProxy;
//    @Test
//    public void test(){
//        transactionServiceProxy.
//    }
}
