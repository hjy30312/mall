package com.hjy.service.impl;

import com.hjy.mapper.CommodityMapper;
import com.hjy.mapper.ShoppingCartMapper;
import com.hjy.pojo.Commodity;
import com.hjy.pojo.ShoppingCart;
import com.hjy.service.ShoppingCartService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/01
 **/
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {


    @Autowired
    ShoppingCartMapper shoppingCartMapper;
    @Autowired
    CommodityMapper commodityMapper;


    @Override
    public List<ShoppingCart> listByUser(long userId) {
        List<ShoppingCart> shoppingCartList = shoppingCartMapper.listByUserId(userId);
        for (ShoppingCart shoppingCart: shoppingCartList) {
            double values = shoppingCart.getCommodityValue()*shoppingCart.getCount();
            shoppingCart.setValues(values);
        }
        return shoppingCartList;
    }
    /**
     * @author: hjy
     * @description:先由主键得到数量 当数量>0 则数量+1 update
     *                  否则insert
     */
    @Override
    public void insertShoppingCart(long commodityId, long userId) {
        int count = shoppingCartMapper.getCount(commodityId,userId);
        if (count == 0) {
            Commodity commodity = commodityMapper.getCommodity(commodityId);
            shoppingCartMapper.insertShoppingCartMapper(commodity,userId);
        } else {
            shoppingCartMapper.addCount(commodityId,userId);
        }

    }

    @Override
    public void delShoppingCart(long commodityId, long userId) {
        shoppingCartMapper.delShoppingCartMapper(commodityId, userId);
    }


    @Override
    public int getCount(long commodityId, long userId) {
        return shoppingCartMapper.getCount(commodityId, userId);
    }

    @Override
    public void delCount(long commodityId, long userId) {
        shoppingCartMapper.delCount(commodityId,userId);
    }

    @Override
    public void addCount(long commodityId, long userId) {
        shoppingCartMapper.addCount(commodityId,userId);
    }
}
