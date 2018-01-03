package com.hjy.pojo;

/**
 * @author hjy
 * @create 2018/01/02
 **/
public class Manufacturer {

    private String manufacturerName;

    private int manufacturerPhone;

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerPhone=" + manufacturerPhone +
                '}';
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getManufacturerPhone() {
        return manufacturerPhone;
    }

    public void setManufacturerPhone(int manufacturerPhone) {
        this.manufacturerPhone = manufacturerPhone;
    }
}
