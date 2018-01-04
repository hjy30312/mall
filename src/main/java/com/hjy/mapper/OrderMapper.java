package com.hjy.mapper;

import com.hjy.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
public interface OrderMapper {


    public int insert(@Param("userId") long userId,@Param("orderValue") double orderValue);

    List<Order> getListByUser(long userId);

    List<Order> getListByCommodity(long commodityId);

    /**
     * 得到所有订单
     * @return
     */
    List<Order> list();

    long getOrderId();
}
