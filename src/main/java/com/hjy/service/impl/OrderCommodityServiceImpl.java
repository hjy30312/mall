package com.hjy.service.impl;

import com.hjy.mapper.OrderCommodityMapper;
import com.hjy.pojo.OrderCommodity;
import com.hjy.service.OrderCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
@Service
public class OrderCommodityServiceImpl implements OrderCommodityService {

    @Autowired
    OrderCommodityMapper orderCommodityMapper;

    @Override
    public List<OrderCommodity> getList(long userId, long commodityId) {
        return orderCommodityMapper.getList(userId, commodityId);
    }

    @Override
    public int insert(long userId, long commodityId, double commodityValue, int count, double value) {
        return orderCommodityMapper.insert(userId, commodityId, commodityValue, count, value);
    }
}
