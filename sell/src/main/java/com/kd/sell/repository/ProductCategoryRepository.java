package com.kd.sell.repository;

import com.kd.sell.dataobject.ProductCategory;
import com.kd.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: sikuncheng
 * @create: 2020-03-12 23:46
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductInfo save(ProductInfo productInfo);
}
