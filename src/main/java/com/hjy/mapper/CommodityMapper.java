package com.hjy.mapper;

import com.hjy.pojo.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/01
 **/
public interface CommodityMapper {
    /**
     * 显示商品
     *
     * @return
     */
    public List<Commodity> list();

    /**
     * 通过商品ID 得到商品
     *
     * @param commodityId
     * @return
     */
    public Commodity getCommodity(long commodityId);

    /**
     * 添加商品
     * @param name
     * @param manufacturerName
     * @param commodityDescribe
     * @param commodityValue
     */
    public void insertCommodity(@Param("name") String name,
                                @Param("manufacturerName") String manufacturerName,
                                @Param("commodityDescribe") String commodityDescribe,
                                @Param("commodityValue") double commodityValue);

    /**
     * 删除商品
     *
     * @param commodityId
     */
    public void delCommodity(long commodityId);

    /**
     * 更新商品
     *
     * @param commodity
     */
    public void updateCommodity(@Param("commodity") Commodity commodity);


}
