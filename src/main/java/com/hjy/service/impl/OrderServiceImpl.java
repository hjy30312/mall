package com.hjy.service.impl;

import com.hjy.mapper.OrderMapper;
import com.hjy.pojo.Order;
import com.hjy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;



    @Override
    public List<Order> getListByUser(long userId) {
        return orderMapper.getListByUser(userId);
    }

    @Override
    public List<Order> list() {
        return orderMapper.list();
    }

    @Override
    public List<Order> getListByCommodity(long commodityId) {
        return orderMapper.getListByCommodity(commodityId);
    }

    @Override
    public void insert(long userId, double orderValue) {
        orderMapper.insert(userId, orderValue);
    }

    @Override
    public long getOrderId() {
        return orderMapper.getOrderId();
    }
}
