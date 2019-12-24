package com.spring.mybatis.mapper;

import com.spring.mybatis.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountMapper {
    @Select("select * from account where id=#{id}")
    Account findById(int id);
}
