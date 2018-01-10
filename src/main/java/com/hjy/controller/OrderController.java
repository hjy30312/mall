package com.hjy.controller;

import com.hjy.service.OrderCommodityService;
import com.hjy.service.OrderService;
import com.hjy.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hjy
 * @create 2018/01/03
 **/
@Controller
@RequestMapping("/Order")
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
    @RequestMapping("/insert")
    public String insertOrder(HttpServletRequest httpServletRequest) {
        long userId = Long.parseLong(httpServletRequest.getParameter("userId"));
        long commodityId = Long.parseLong(httpServletRequest.getParameter("commodityId"));
        double commodityValue = Double.parseDouble(httpServletRequest.getParameter("commodityValue"));

        int count = Integer.parseInt(httpServletRequest.getParameter("count"));
        double value = Double.parseDouble(httpServletRequest.getParameter("value"));

        orderService.insert(userId,commodityId);
        long orderId = orderService.getOrderId();

        orderCommodityService.insert(
                orderId,commodityId,commodityValue,count,value);
        shoppingCartService.delShoppingCart(commodityId,userId);
        return null;
    }
}
