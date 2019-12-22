package com.spring.ehcache.dao;

import com.spring.ehcache.domian.Account;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public interface EhCacheDao {
    @Cacheable("AccountCache")
    Account findOne(int id);
    @CachePut(value = "AccountCache",key = "#account.id")
    Account save(Account account);
    @CacheEvict("AccountCache")
    void delete(int id);
}
