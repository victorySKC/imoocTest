package com.kd.sell.service.impl;

import com.kd.sell.dataobject.ProductCategory;
import com.kd.sell.repository.ProductCategoryRepository;
import com.kd.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sell
 * @description: 类目
 * @author: sikuncheng
 * @create: 2020-03-13 13:11
 **/
@Service
public class CategoryServiceImpl implements CategoryService {
    //这是干什么的
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
