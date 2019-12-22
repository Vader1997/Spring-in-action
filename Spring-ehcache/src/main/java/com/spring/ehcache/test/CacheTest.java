package com.spring.ehcache.test;

import com.spring.ehcache.config.EhCacheConfig;
import com.spring.ehcache.dao.EhCacheDao;
import com.spring.ehcache.domian.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EhCacheConfig.class)
public class CacheTest {
    @Autowired
    EhCacheDao ehCacheDao;

    @Test
    public void test(){
        System.out.println(ehCacheDao.findOne(1).toString());
        Account account2 = ehCacheDao.findOne(1);
        System.out.println(account2.toString());
        Account account = new Account(4,"ddd",1000L);
        ehCacheDao.save(account);
        Account account1 = ehCacheDao.findOne(4);
        System.out.println(account1.toString());
        ehCacheDao.delete(1);
        System.out.println(ehCacheDao.findOne(1).toString());
    }
}
