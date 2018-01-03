package com.hjy.service.impl;

import com.hjy.mapper.CategoryMapper;
import com.hjy.mapper.CommodityMapper;
import com.hjy.pojo.Commodity;
import com.hjy.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/01
 **/
@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> list(){
        return commodityMapper.list();
    }

    @Override
    public Commodity getCommodity(long commodityId) {
        return commodityMapper.getCommodity(commodityId);
    }

    @Override
    public void insertCommodity(String name, String commodityDescribe, double commodityValue) {
        commodityMapper.insertCommodity(name, commodityDescribe, commodityValue);
    }

    @Override
    public void delCommodity(long commodityId) {
        commodityMapper.delCommodity(commodityId);
    }
}
