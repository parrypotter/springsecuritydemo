package com.example.springsecuritydemo2.mapper;


import com.example.springsecuritydemo2.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    UserInfo selectOne(String username);
}
