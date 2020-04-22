package com.kd.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @program: sell
 * @description: 类目
 * @author: sikuncheng
 * @create: 2020-03-12 22:33
 **/
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**
     * 类目id.
     */
    @Id
    @GeneratedValue
    //@GeneratedValue自增的字符
    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;
/*
    private Data createTime;

    private Data updateTime;*/

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
