package com.spring.transaction1;

import com.spring.transaction1.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

@Component
public class TransactionServiceProxy {
    @Autowired
    @Qualifier("transactionManager")
    PlatformTransactionManager transactionManager;
    @Autowired
    TransactionService transactionService;
    public TransactionProxyFactoryBean getProxyFactoryBean(TransactionProxyFactoryBean proxyFactoryBean){
        proxyFactoryBean.setTransactionManager(transactionManager);
        proxyFactoryBean.setTarget(transactionService);
        return proxyFactoryBean;
    }
}
