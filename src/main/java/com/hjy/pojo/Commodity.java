package com.hjy.pojo;

import java.util.Date;

/**
 * @author hjy
 * @create 2018/01/01
 **/
public class Commodity {
    private long commodityId;

    private String name;

    private Date createTime;

    private String manufacturerName;

    private String commodityDescribe;

    private double commodityValue;

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityId=" + commodityId +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", commodityDescribe='" + commodityDescribe + '\'' +
                ", commodityValue=" + commodityValue +
                '}';
    }

    public long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(long commodityId) {
        this.commodityId = commodityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe;
    }

    public double getCommodityValue() {
        return commodityValue;
    }

    public void setCommodityValue(double commodityValue) {
        this.commodityValue = commodityValue;
    }
}
