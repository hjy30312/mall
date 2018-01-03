package com.hjy.pojo;

/**
 * 产品明细表
 * @author hjy
 * @create 2018/01/02
 **/
public class OrderCommodity {

    private long orderId;

    private long commodityId;

    private double commodityValue;

    private int count;

    private double value;



    @Override
    public String toString() {
        return "OrderCommodity{" +
                "orderId=" + orderId +
                ", commodityId=" + commodityId +
                ", commodityValue=" + commodityValue +
                ", count=" + count +
                ", value=" + value +
                '}';
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(long commodityId) {
        this.commodityId = commodityId;
    }

    public double getCommodityValue() {
        return commodityValue;
    }

    public void setCommodityValue(double commodityValue) {
        this.commodityValue = commodityValue;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
