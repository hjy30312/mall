package com.hjy.service;

import com.hjy.pojo.Manufacturer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/

public interface ManufacturerService {

    List<Manufacturer> list();

    Manufacturer get(String manufacturerName);

    void del(String manufacturerName);

    /**
     * 当int为0时表示该生产工厂已存在
     *
     * @param manufacturerName
     * @param manufacturerPhone
     * @return 0：工厂已存在 1：添加成功
     */
    int insert(String manufacturerName,int manufacturerPhone);

    void update( String manufacturerName, int manufacturerPhone);
}
