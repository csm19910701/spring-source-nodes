package org.springframework.mybatis.mapper;

import org.springframework.mybatis.entity.Orders;

public interface OrdersMapper {

    /**
     * 订单插入
     * @param orders
     * @return
     */
    int insertOrder(Orders orders);

}
