package com.spring.transaction2.dao;

public interface TransactionDao {
     void out(String form, double money);
     void in(String to, double money);
}
