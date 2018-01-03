package com.hjy.mapper;

import com.hjy.pojo.OrderCommodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
public interface OrderCommodityMapper {
    public List<OrderCommodity> getList(@Param("userId") long userId, @Param("commodityId") long commodityId);

    /**
     *
     * @param userId
     * @param commodityId
     * @param commodityValue 单价
     * @param count 数量
     * @param value 总价
     * @return
     */
    public int insert(@Param("userId")long userId,
                      @Param("commodityId")long commodityId,
                      @Param("commodityValue")double commodityValue,
                      @Param("count")int count,
                      @Param("value")double value);



}
