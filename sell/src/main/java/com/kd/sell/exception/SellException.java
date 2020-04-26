package com.kd.sell.exception;

import com.kd.sell.enums.ResultEnum;

/**
 * @program: sell
 * @description: 买家购买时异常类
 * @author: sikuncheng
 * @create: 2020-04-26 09:17
 **/
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
