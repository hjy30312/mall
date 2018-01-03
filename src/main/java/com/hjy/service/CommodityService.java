package com.hjy.service;

import com.hjy.pojo.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/01
 **/
public interface CommodityService {
    /**
     * 显示商品列表
     * @return
     */
    List<Commodity> list();

    Commodity getCommodity(long commodityId);

    /**
     * 添加商品
     * @param name
     * @param commodityDescribe
     * @param commodityValue
     */
    void insertCommodity(String name, String commodityDescribe, double commodityValue);

    /**
     * 删除商品
     * @param commodityId
     */
    void delCommodity(long commodityId);

}
