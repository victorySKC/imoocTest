package com.kd.sell.repository;

import com.kd.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: imoocTest
 * @description: 订单实现类接口
 * @author: sikuncheng
 * @create: 2020-04-09 21:08
 **/
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    //按照买家openID查询订单，并分页
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
