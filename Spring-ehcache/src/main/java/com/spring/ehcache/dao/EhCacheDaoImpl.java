package com.spring.ehcache.dao;

import com.spring.ehcache.domian.Account;
import com.spring.ehcache.domian.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EhCacheDaoImpl implements EhCacheDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public Account findOne(int id) {
        System.out.println("findOne方法被调用");
        return jdbcTemplate.queryForObject("select * from account where id = ?",new AccountMapper(),id);
    }

    @Override
    public Account save(Account account) {
        System.out.println("save方法被调用");
        jdbcTemplate.update("insert INTO account VALUES (?,?,?)",account.getId(),account.getName(),account.getMoney());
        return account;
    }

    @Override
    public void delete(int id) {
        System.out.println("delete方法被调用,只删除缓存");
        //return jdbcTemplate.update("delete from account where id=?",id);
    }
}
