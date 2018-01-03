package com.hjy.service.impl;

import com.hjy.pojo.Manufacturer;
import com.hjy.service.ManufacturerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:applicationContext.xml",
        "classpath:mybatis-config.xml"})
public class ManufacturerServiceImplTest {


    @Autowired
    ManufacturerService manufacturerService;
    @Test
    public void list() throws Exception {
        List<Manufacturer> manufacturerList = manufacturerService.list();
        System.out.println(manufacturerList);
    }

    @Test
    public void get() throws Exception {
        System.out.println(manufacturerService.get("苹果公司"));
    }

    @Test
    public void del() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        int ans = manufacturerService.insert("大米公司",13597);
        System.out.println(ans);
    }

    @Test
    public void update() throws Exception {
        manufacturerService.update("小米公司",13598);
    }

}