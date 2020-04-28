package com.kd.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kd.sell.dataobject.OrderDetail;
import com.kd.sell.dto.OrderDTO;
import com.kd.sell.enums.ResultEnum;
import com.kd.sell.exception.SellException;
import com.kd.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: sell
 * @description: 将OrderForm类转换为需要的对象，前端创建服务时用
 * @author: sikuncheng
 * @create: 2020-04-28 11:21
 **/
@Slf4j
public class OrderForm2OrderDTOConverter {

    /* public static OrderDTO convert(OrderForm orderForm){
         Gson gson = new Gson();

         OrderDTO orderDTO = new OrderDTO();
         orderDTO.setBuyerAddress(orderForm.getAddress());
         orderDTO.setBuyerName(orderForm.getName());
         orderDTO.setBuyerPhone(orderForm.getPhone());
         orderDTO.setBuyerOpenid(orderForm.getOpenid());
         //because cart is not null,and it is a collection
         List<OrderDetail> orderDetailList = new ArrayList<>();

         try {
             orderDetailList = gson.fromJson(orderForm.getItems()
                     , new TypeToken<List<OrderDetail>>(){}.getType());
         }catch (Exception e){
             log.error("【对象转换】 错误，string =  ", orderForm.getItems());
             throw new SellException(ResultEnum.PARAM_ERROR);
         }

         orderDTO.setOrderDetailList(orderDetailList);

         return orderDTO;
     }*/
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误, string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
