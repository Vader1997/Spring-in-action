package com.spring.jdbc.dao;

import com.spring.jdbc.domain.Account;

import java.util.List;

public interface JdbcDAO {
    List<Account> getAccount();
}
