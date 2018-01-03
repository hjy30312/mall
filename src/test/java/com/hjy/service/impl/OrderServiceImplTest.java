package com.hjy.service.impl;

import com.hjy.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:applicationContext.xml",
        "classpath:mybatis-config.xml"})
public class OrderServiceImplTest {

    @Autowired
    OrderService orderService;



    @Test
    public void insert() throws Exception {
        orderService.insert(1000,500);
    }

}