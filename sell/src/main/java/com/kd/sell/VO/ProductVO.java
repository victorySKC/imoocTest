package com.kd.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @program: imoocTest
 * @description: 商品category（包含类目）前端返回值对象
 * @author: sikuncheng
 * @create: 2020-04-07 23:49
 **/
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
