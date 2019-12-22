package com.spring.ehcache.config;



import com.mchange.v2.c3p0.ComboPooledDataSource;
import net.sf.ehcache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

@Configuration
@EnableCaching
@ComponentScan(basePackages = "com.spring.ehcache.dao")
public class EhCacheConfig {

    @Bean
    public EhCacheCacheManager cacheManager(CacheManager cacheManager){
        return new EhCacheCacheManager(cacheManager);
    }

    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
        EhCacheManagerFactoryBean ehCacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        ehCacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        return ehCacheManagerFactoryBean;

    }

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
