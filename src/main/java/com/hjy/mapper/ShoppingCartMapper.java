package com.hjy.mapper;

import com.hjy.pojo.Commodity;
import com.hjy.pojo.ShoppingCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/01
 **/
public interface ShoppingCartMapper {
    public List<ShoppingCart> listByUserId(@Param("userId") long userId);

    /**
     * 添加物品进购物车
     * @param commodity
     * @param userId
     * @return
     */
    public int insertShoppingCartMapper(@Param("commodity")Commodity commodity,@Param("userId")long userId);

    /**
     * 从购物车里删除这件物品
     * @param commodityId
     * @param userId
     * @return
     */
    public void delShoppingCartMapper(@Param("commodityId")long commodityId,@Param("userId")long userId);



    void addCount(@Param("commodityId")long commodityId,@Param("userId") long userId);

    int getCount(@Param("commodityId")long commodityId,@Param("userId") long userId);

    void delCount(@Param("commodityId")long commodityId,@Param("userId") long userId);
}
