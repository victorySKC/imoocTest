package com.kd.sell.VO;

import lombok.Data;

/**
 * @program: imoocTest
 * @description: http强求返回的最外层对象
 * @author: sikuncheng
 * @create: 2020-04-07 23:32
 **/
@Data
public class ResultVO <T>{
    /* 错误码 */
    private Integer code;

    /* 提示信息*/
    private String msg;

    /**返回具体内容**/
    private T data;
}
