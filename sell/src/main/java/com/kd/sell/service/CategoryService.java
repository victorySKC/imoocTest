package com.kd.sell.service;

import com.kd.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @program: sell
 * @description: 买家端服务层
 * @author: sikuncheng
 * @create: 2020-03-13 13:08
 **/
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
