package com.hjy.service;

import com.hjy.pojo.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
public interface OrderService {

    /**
     * 通过用户ID 得到他的所有订单
     * @param userId
     * @return
     */
    public List<Order> getListByUser(long userId);

    /**
     * 获得所有订单
     * @return
     */
    public List<Order> list();

    /**
     * 通过商品ID 得到商品的所有订单
     * @param commodityId
     * @return
     */
    List<Order> getListByCommodity(long commodityId);



    public int insert( long userId, double orderValue);

}
