package com.hjy.service.impl;

import com.hjy.service.ShoppingCartService;
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
public class ShoppingCartServiceImplTest {

    @Autowired
    ShoppingCartService shoppingCartService;


    @Test
    public void listByUser() throws Exception {
    }

    @Test
    public void insertShoppingCart() throws Exception {
    }

    @Test
    public void delShoppingCart() throws Exception {
    }

    @Test
    public void getCount() throws Exception {
        int ans = shoppingCartService.getCount(1000,1000);
        System.out.println(ans);
    }

    @Test
    public void delCount() throws Exception {
    }

    @Test
    public void addCount() throws Exception {
    }

}