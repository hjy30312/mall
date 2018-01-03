package com.hjy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjy.pojo.Commodity;
import com.hjy.service.CommodityService;
import com.hjy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView listCommdity(Page page) {
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Commodity> commodityList= commodityService.list();

        int total = (int) new PageInfo<>(commodityList).getTotal();

        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("commodityList", commodityList);
        // 放入jsp路径
        mav.setViewName("index");
        return mav;
    }

}
