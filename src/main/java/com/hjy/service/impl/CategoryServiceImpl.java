package com.hjy.service.impl;


import com.hjy.mapper.CategoryMapper;
import com.hjy.pojo.Category;
import com.hjy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;
	

	@Override
	public List<Category> list(){
		return categoryMapper.list();
	}


}
