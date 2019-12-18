package com.spring.transaction1.dao;

public interface TransactionDao {
     void out(String form,double money);
     void in(String to,double money);
}
