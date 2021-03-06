package com.spring.transaction1.test;

import com.spring.transaction1.service.TransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application1.xml")
public class TransactionServiceTest {
    @Autowired
    @Qualifier("transferServiceProxy")
    TransactionService transferServiceProxy;

    @Test
    public void test(){
        transferServiceProxy.trans("aaa","bbb",100);
    }
}