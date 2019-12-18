package com.spring.transaction1;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager {
    @Autowired
    @Qualifier("defaultDataSource")
    ComboPooledDataSource dataSource;

    public DataSourceTransactionManager transactionManager(DataSourceTransactionManager transactionManager){
            transactionManager.setDataSource(dataSource);
            return transactionManager;
    }
}
