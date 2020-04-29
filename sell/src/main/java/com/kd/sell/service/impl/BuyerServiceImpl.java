package com.kd.sell.service.impl;

import com.kd.sell.dto.OrderDTO;
import com.kd.sell.enums.ResultEnum;
import com.kd.sell.exception.SellException;
import com.kd.sell.service.BuyerService;
import com.kd.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: sell
 * @description: BuyerService 实现类
 * @author: sikuncheng
 * @create: 2020-04-29 10:35
 **/
@Slf4j
@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return null;
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        return null;
    }

    //在类里面新建的一个私有的方法。可以用来判断订单是否为空以及是否属于该顾客
    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        //判断是不是自己的订单
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("【查询订单】订单的openid不一致. openid={}, orderDTO={}", openid, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
