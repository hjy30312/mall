package com.hjy.pojo;

import java.util.Date;

/**
 * @author hjy
 * @create 2018/01/01
 **/
public class ShoppingCart {
    private long commodityId;

    private long userId;

    private Date createTime;

    private int count;

    private double commodityValue;

    private String commodityName;

    private double values;


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "commodityId=" + commodityId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", count=" + count +
                ", commodityValue=" + commodityValue +
                ", commodityName='" + commodityName + '\'' +
                ", values=" + values +
                '}';
    }



    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }



    public long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(long commodityId) {
        this.commodityId = commodityId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCommodityValue() {
        return commodityValue;
    }

    public void setCommodityValue(double commodityValue) {
        this.commodityValue = commodityValue;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
