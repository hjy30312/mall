package com.hjy.controller;

import com.hjy.pojo.ShoppingCart;
import com.hjy.pojo.User;
import com.hjy.service.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author hjy
 * @create 2018/01/01
 **/
@Controller
@RequestMapping("/ShoppingCart")
public class ShoppingCartController {
    @Autowired
    ShoppingCartService shoppingCartService;

    @RequestMapping("/index")
    public String listShoppingCart(
            HttpServletRequest httpServletRequest,
            Model model) {
        ModelAndView mav = new ModelAndView();
        User user = null;
        HttpSession session = httpServletRequest.getSession();
        user = (User) session.getAttribute("user");
        long userId = user.getUserId();

        List<ShoppingCart> shoppingCartList = shoppingCartService.listByUser(userId);

        model.addAttribute("shoppingCartList",shoppingCartList);
        return "listShoppingCart";

    }


    @RequestMapping("/insert")
    @ResponseBody
    public String insertShoppingCart(
            HttpServletRequest httpServletRequest,
            Model model) {
        ModelAndView mav = new ModelAndView();

        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user");
        String commodityId = httpServletRequest.getParameter("commodityId");
        if (user == null) {
            return "false";
        } else {
            long userId = user.getUserId();



            int count = shoppingCartService.getCount(Long.parseLong(commodityId), userId);
            if (count == 0) {
                //返回0  说明购物车还没有
                shoppingCartService.insertShoppingCart(Long.parseLong(commodityId), userId);
            } else {
                //返回1，则添加数量
                shoppingCartService.addCount(Long.parseLong(commodityId), userId);
            }
            return "success";
        }
    }
}
