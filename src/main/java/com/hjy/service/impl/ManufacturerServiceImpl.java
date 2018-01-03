package com.hjy.service.impl;

import com.hjy.mapper.ManufacturerMapper;
import com.hjy.pojo.Manufacturer;
import com.hjy.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hjy
 * @create 2018/01/02
 **/
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    ManufacturerMapper manufacturerMapper;

    @Override
    public List<Manufacturer> list() {
        return manufacturerMapper.list();
    }

    @Override
    public Manufacturer get(String manufacturerName) {
        return manufacturerMapper.get(manufacturerName);
    }

    @Override
    public void del(String manufacturerName) {
        manufacturerMapper.del(manufacturerName);
    }

    @Override
    public int insert(String manufacturerName, int manufacturerPhone) {
        return manufacturerMapper.insert(manufacturerName, manufacturerPhone);
    }

    @Override
    public void update(String manufacturerName, int manufacturerPhone) {
        manufacturerMapper.update(manufacturerName,manufacturerPhone);
    }
}
