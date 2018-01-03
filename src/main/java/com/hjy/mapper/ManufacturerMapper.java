package com.hjy.mapper;

import com.hjy.pojo.Commodity;
import com.hjy.pojo.Manufacturer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
public interface ManufacturerMapper {
    /**
     * 显示生产厂家
     * @return
     */
    public List<Manufacturer> list();

    public Manufacturer get(String manufacturerName);

    public void del(@Param("name")String manufacturerName);

    public int insert(@Param("name") String manufacturerName,@Param("phone") int manufacturerPhone);

    public void update(@Param("name") String manufacturerName,@Param("phone") int manufacturerPhone);
}
