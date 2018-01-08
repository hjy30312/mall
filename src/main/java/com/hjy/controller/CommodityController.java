package com.hjy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjy.pojo.Commodity;
import com.hjy.pojo.Manufacturer;
import com.hjy.service.CommodityService;
import com.hjy.service.ManufacturerService;
import com.hjy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @Autowired
    ManufacturerService manufacturerService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView listCommodity(Page page) {
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
