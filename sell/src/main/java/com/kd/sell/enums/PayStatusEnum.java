package com.kd.sell.enums;

import lombok.Getter;

/**
 * @program: imoocTest
 * @description: 支付状态
 * @author: sikuncheng
 * @create: 2020-04-09 21:01
 **/
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"制服成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
