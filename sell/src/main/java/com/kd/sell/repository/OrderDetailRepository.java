package com.kd.sell.repository;

import com.kd.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: imoocTest
 * @description: 订单详情表接口
 * @author: sikuncheng
 * @create: 2020-04-09 21:06
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    //订单详情表
    List<OrderDetail> findByOrderId(String orderId);
}
