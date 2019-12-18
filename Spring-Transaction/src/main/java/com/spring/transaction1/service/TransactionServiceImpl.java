package com.spring.transaction1.service;

import com.spring.transaction1.dao.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionDao transactionDao;
    @Override
    public void trans(String form, String to, double money) {
        transactionDao.in("aaa",100);
        int i = 1/0;
        transactionDao.out("bbb",1900);
    }
}
