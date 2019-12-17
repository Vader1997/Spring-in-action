package com.spring.jdbc.config;

import com.spring.jdbc.dao.JdbcDAO;
import com.spring.jdbc.domain.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class JdbcConfig {
    /**
     * 使用c3p0数据池
     * @return
     * @throws PropertyVetoException
     */
    @Bean
    public ComboPooledDataSource getDataBase() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/springtest?serverTimezone=UTC");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setUser("root");
        dataSource.setPassword("142663");
        return dataSource;
    }


    @Bean
    public JdbcTemplate jdbcTemplate(ComboPooledDataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
