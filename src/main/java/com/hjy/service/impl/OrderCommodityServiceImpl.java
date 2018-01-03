package com.hjy.service.impl;

import com.hjy.mapper.CommodityMapper;
import com.hjy.mapper.OrderCommodityMapper;
import com.hjy.mapper.ShoppingCartMapper;
import com.hjy.pojo.Commodity;
import com.hjy.pojo.OrderCommodity;
import com.hjy.service.OrderCommodityService;
import com.hjy.service.ShoppingCartService;
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

    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    @Override
    public List<OrderCommodity> getList(long orderId, long commodityId) {
        return orderCommodityMapper.getList(orderId, commodityId);
    }

    @Override
    public int insert(long orderId, long commodityId, double commodityValue, int count, double value) {
        return 0;
    }


    public int insert(long userId, long commodityId) {
        Commodity commodity = commodityMapper.getCommodity(commodityId);
        //单价
        double commodityValue = commodity.getCommodityValue();
        //数量
        int count = shoppingCartMapper.getCount(commodityId, userId);
        //总价值
        double value = commodityValue * count;

        return orderCommodityMapper.insert(userId, commodityId, commodityValue, count, value);
    }
}
