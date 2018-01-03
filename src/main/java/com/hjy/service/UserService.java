package com.hjy.service;

import com.hjy.pojo.User;


/**
 * @author hjy
 * @create 2018/01/01
 **/
public interface UserService {

    User queryByUsername(String username);

    void insertUser(User user);
}
