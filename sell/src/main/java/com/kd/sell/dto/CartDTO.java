package com.kd.sell.dto;

import lombok.Data;

/**
 * @program: sell
 * @description: 前端页面购物车信息
 * @author: sikuncheng
 * @create: 2020-04-26 08:37
 **/
@Data
public class CartDTO {
    /**
     * 商品ID
     **/
    private String productId;

    /**
     * 数量.
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
