package com.hjy.service.impl;

import com.hjy.mapper.UserMapper;
import com.hjy.pojo.User;
import com.hjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hjy
 * @create 2018/01/01
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User queryByUsername(String username) {
        return userMapper.queryByUsername(username);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }




}
