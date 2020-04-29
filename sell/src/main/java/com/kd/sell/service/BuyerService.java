package com.kd.sell.service;

import com.kd.sell.dto.OrderDTO;

/**
 * @program: sell
 * @description: 买家的一个封装接口，处理一些逻辑
 * @author: sikuncheng
 * @create: 2020-04-29 10:30
 **/
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
