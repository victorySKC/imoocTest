package com.kd.sell.util;

import java.util.Random;

/**
 * @program: sell
 * @description: 静态方法生成主键
 * @author: sikuncheng
 * @create: 2020-04-26 10:15
 **/
public class KeyUtil {
    /**
     * 时间 + 随机数
     **/
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
