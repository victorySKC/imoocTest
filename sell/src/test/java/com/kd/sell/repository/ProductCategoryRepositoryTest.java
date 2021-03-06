package com.kd.sell.repository;

import com.kd.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    //@Transactional  不会在数据库产生数据
    @Transactional
    public void saveTest() {
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryName("农村最爱");
//        productCategory.setCategoryType(3);
      /*  ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(188);
        repository.save(productCategory);*/

        ProductCategory productCategory = new ProductCategory("男士最爱", 4);
        ProductCategory result = repository.save(productCategory);
        //判断是否成功
        Assert.assertNotNull(result);

    }

    @Test

    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}