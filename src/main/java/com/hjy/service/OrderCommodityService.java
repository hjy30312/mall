package com.hjy.service;

import com.hjy.pojo.OrderCommodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
public interface OrderCommodityService {

    public List<OrderCommodity> getList(long orderId, long commodityId);


    public int insert(long orderId,
                      long commodityId,
                      double commodityValue,
                      int count,
                      double value);



}
