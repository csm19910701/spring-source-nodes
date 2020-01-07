package org.springframework.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mybatis.entity.Orders;
import org.springframework.mybatis.mapper.OrdersMapper;
import org.springframework.mybatis.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * 开启事务
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public double addOrder(String userId, double price) {
		Orders orders = new Orders();
		orders.setUserId(userId);
		orders.setOrderPrice(new BigDecimal(price));
		orders.setUpdateTime(new Date());
		return ordersMapper.insertOrder(orders);
	}

}
