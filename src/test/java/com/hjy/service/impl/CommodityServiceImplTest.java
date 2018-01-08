package com.hjy.service.impl;

import com.hjy.mapper.CommodityMapper;
import com.hjy.pojo.Commodity;
import com.hjy.service.CategoryService;
import com.hjy.service.CommodityService;
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
public class CommodityServiceImplTest {

    @Autowired
    private CommodityService commodityService;
    @Test
    public void list() throws Exception {
        System.out.println(commodityService.list());
    }

    @Test
    public void getCommodity() throws Exception {
        Commodity commodity = commodityService.getCommodity(1007);
        System.out.println(commodity);
    }

    @Test
    public void insertCommodity() throws Exception {
        commodityService.insertCommodity("hjy", "小米公司", "何金洋",100);
    }

    @Test
    public void delCommodity() throws Exception {
        commodityService.delCommodity(1009);
    }

}