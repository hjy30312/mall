package com.hjy.mapper;

import com.hjy.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author hjy
 * @create 2018/01/01
 **/
public interface UserMapper {

    User queryByUsername(@Param("username") String username);

    User insertUser(@Param("user")User user);
}
