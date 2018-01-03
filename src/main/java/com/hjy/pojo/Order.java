package com.hjy.pojo;

import java.util.Date;

/**
 * 订单
 * @author hjy
 * @create 2018/01/02
 **/
public class Order {

    private long orderId;

    private long userId;

    private Date createTime;

    private double OrderValue;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", OrderValue=" + OrderValue +
                '}';
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
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

    public double getOrderValue() {
        return OrderValue;
    }

    public void setOrderValue(double orderValue) {
        OrderValue = orderValue;
    }
}
