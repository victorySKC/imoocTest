package com.kd.sell.repository;

import com.kd.sell.dataobject.ProductInfo;
import com.kd.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    //保存的测试类
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setProductName("牛肉");
        productInfo.setProductDescription("good");
        productInfo.setProductPrice(new BigDecimal(12));
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setProductStock(100);
        productInfo.setProductIcon("http://ssss.sss");
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }
    @Test
    //通过状态查询
    public void findByProductStatus(){
        List<ProductInfo> productInfoList = repository.findByProductStatus(1);
        System.out.println(productInfoList);
        Assert.assertNotEquals(ProductStatusEnum.DOWN,productInfoList.size());
    }

}