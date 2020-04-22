package com.kd.sell.repository;

import com.kd.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author sikuncheng
 * @description 订单详情表测试类
 * @name
 * @date 2020/4/9 22:06
 * @param
 * @return
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    //之前没有数据，所以要加上
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345670");
        orderDetail.setOrderId("11111113");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("11111113");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.5));
        orderDetail.setProductQuantity(3);
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("11111113");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}