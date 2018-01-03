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
        //检查Session中是否存在
        User user = checkUser(httpServletRequest);

        if(user == null) {
            //还没登录
            return "redirect:/login";
        } else {
            long userId = user.getUserId();
            List<ShoppingCart> shoppingCartList = shoppingCartService.listByUser(userId);
            model.addAttribute("shoppingCartList",shoppingCartList);
            return "listShoppingCart";
        }
    }

    /**
     * 检查Session   用户是否登录
     * @return
     */
    public static User checkUser(HttpServletRequest httpServletRequest) {
        User user = null;
        HttpSession session = httpServletRequest.getSession();
        user = (User) session.getAttribute("user");
        return user;
    }

    @RequestMapping(value = "/checkSession", method = RequestMethod.GET)
    @ResponseBody
    public String checkSession(HttpServletRequest httpServletRequest) {
        User user = checkUser(httpServletRequest);
        if (user == null) {
            return "false";
        } else {
            return  "true";
        }
    }


    @RequestMapping("/insert")
    @ResponseBody
    public String insertShoppingCart(
            HttpServletRequest httpServletRequest,
            Model model) {
        ModelAndView mav = new ModelAndView();
        User user = checkUser(httpServletRequest);
        if (user == null) {
            return "false";
        } else {
            String commodityId = httpServletRequest.getParameter("commodityId");
            long userId = user.getUserId();
            int count = shoppingCartService.getCount(Long.parseLong(commodityId),userId);
            if (count == 0) {
                //返回0  说明购物车还没有
                shoppingCartService.insertShoppingCart(Long.parseLong(commodityId),userId);
            } else {
                //返回1，则添加数量
                shoppingCartService.addCount(Long.parseLong(commodityId),userId);
            }
            return "success";
        }
    }
}
