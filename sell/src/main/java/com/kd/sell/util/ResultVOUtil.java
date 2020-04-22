package com.kd.sell.util;

import com.kd.sell.VO.ResultVO;

/**
 * @program: imoocTest
 * @description: 基础类
 * @author: sikuncheng
 * @create: 2020-04-09 11:34
 **/
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("success");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
