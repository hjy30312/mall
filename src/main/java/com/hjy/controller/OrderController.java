package com.hjy.controller;

import com.hjy.service.OrderCommodityService;
import com.hjy.service.OrderService;
import com.hjy.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hjy
 * @create 2018/01/03
 **/
@Controller
public class OrderController {

    @Autowired
    OrderCommodityService orderCommodityService;

    @Autowired
    OrderService orderService;

    @Autowired
    ShoppingCartService shoppingCartService;


    /**
     * 获取客户ID，商品编号  把信息写入订单表和明细表
     * 同时删除该用户所对应的购物车信息
     * @return
     */
    public String insertOrder(HttpServletRequest httpServletRequest) {
        String userId = httpServletRequest.getParameter("userId");
        String commodityId = httpServletRequest.getParameter("commodityId");

        orderService.insert(Long.parseLong(userId),Long.parseLong(commodityId));


       // orderCommodityService.insert();

        //shoppingCartService.delShoppingCart();
        return null;
    }











}
