package com.hjy.service;

import com.hjy.pojo.Commodity;
import com.hjy.pojo.ShoppingCart;
import com.hjy.pojo.User;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/01
 **/
public interface ShoppingCartService {
    /**
     * 通过用户ID获得购物车列表
     * @param userId
     * @return
     */
    List<ShoppingCart> listByUser(long userId);

    /**
     * 商品加入购物车
     * @param commodityId
     * @param userId
     * @return
     */
    void insertShoppingCart(long commodityId, long userId);

    /**
     * 从购物车中删除物品
     * @param commodityId
     * @param userId
     */
    void delShoppingCart(long commodityId, long userId);

    /**
     * 获得（商品，用户）购物车的数量
     * @param commodityId
     * @param userId
     * @return
     */
    int getCount(long commodityId, long userId);

    /**
     * 添加数量
     * @param commodityId
     * @param userId
     */
    void addCount(long commodityId, long userId);

    /**
     * 减少数量
     * @param commodityId
     * @param userId
     */
    void delCount(long commodityId, long userId);


}
