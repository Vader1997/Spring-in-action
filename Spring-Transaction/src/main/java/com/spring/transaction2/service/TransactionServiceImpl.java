package com.spring.transaction2.service;

import com.spring.transaction2.dao.TransactionDao;

public class TransactionServiceImpl implements TransactionService {
    private TransactionDao transactionDao;

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    @Override
    public void trans(String form, String to, double money) {
        transactionDao.in(form,money);
        int i = 1/0;
        transactionDao.out(to,money);
    }
}
