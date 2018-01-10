package com.hjy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjy.pojo.Commodity;
import com.hjy.pojo.Manufacturer;
import com.hjy.pojo.ShoppingCart;
import com.hjy.pojo.User;
import com.hjy.service.CommodityService;
import com.hjy.service.ManufacturerService;
import com.hjy.service.ShoppingCartService;
import com.hjy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("")
public class CommodityController {
    @Autowired
    CommodityService commodityService;

    @Autowired
    ManufacturerService manufacturerService;

    @Autowired
    ShoppingCartService shoppingCartService;

    @RequestMapping(value = "user/index", method = RequestMethod.GET)
    public ModelAndView listCommodity(HttpServletRequest httpServletRequest) {
        ModelAndView mav = new ModelAndView();


        List<Commodity> commodityList= commodityService.list();

        User user = null;
        HttpSession session = httpServletRequest.getSession();
        user = (User) session.getAttribute("user");
        long userId = user.getUserId();

        List<ShoppingCart> shoppingCartList = shoppingCartService.listByUser(userId);

        // 放入转发参数
        mav.addObject("commodityList", commodityList);
        mav.addObject("shoppingCartList", shoppingCartList);
        // 放入jsp路径
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "admin/back_index", method = RequestMethod.GET)
    public ModelAndView listAdminCommodity() {
        ModelAndView mav = new ModelAndView();

        List<Commodity> commodityList= commodityService.list();

        // 放入转发参数
        mav.addObject("commodityList", commodityList);
        // 放入jsp路径
        mav.setViewName("back_index");
        return mav;
    }



    @RequestMapping(value = "update", method = RequestMethod.GET)
    public void updateCommodity(long commodityId,
                                String name,
                                String manufacturerName,
                                String commodityDescribe,
                                double commodityValue) {
        commodityService.updateCommodity(commodityId, name, manufacturerName, commodityDescribe, commodityValue);
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public void deleteCommodity(long commodityId) {
        commodityService.delCommodity(commodityId);
    }


    @RequestMapping(value = "insert", method = RequestMethod.GET)
    @ResponseBody
    public String insertCommodity(String name,
                                  String manufacturerName,
                                  String commodityDescribe,
                                  double commodityValue) {



        //检查是否有该生产工厂
        boolean flag = manufacturerService.get(manufacturerName).equals(null);

        if (flag) {
            return "false";
        } else {
            commodityService.insertCommodity(name, manufacturerName, commodityDescribe, commodityValue);
            return "success";
        }
    }

}
