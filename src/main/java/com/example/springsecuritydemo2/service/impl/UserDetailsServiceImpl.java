package com.example.springsecuritydemo2.service.impl;


import com.example.springsecuritydemo2.entity.UserInfo;
import com.example.springsecuritydemo2.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 2.查询用户
        UserInfo user = usersMapper.selectOne(username);
        // PasswordEncoder encoder = new BCryptPasswordEncoder();
        // boolean result = encoder.matches(password, user.getPassword());
        UserDetails userDetails = null;
        // 3.封装为UserDetails对象
        return User.withUsername(user.getUsername())
                    .password(user.getPassword())
                    .authorities("admin")
                    .build();
    }
}
