package org.springframework.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mybatis.service.CatService;
import org.springframework.mybatis.service.GoodsService;
import org.springframework.mybatis.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private GoodsService goodsService;

    //我的购物车
    public void addCat(String userId, double price, String goodsName) {
        orderService.addOrder(userId, price);
        goodsService.addGoods(goodsName);
    }

}
