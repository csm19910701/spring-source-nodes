package org.springframework.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mybatis.entity.Goods;
import org.springframework.mybatis.mapper.GoodsMapper;
import org.springframework.mybatis.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int addGoods(String goodsName) {
        Goods goods = new Goods();
        goods.setGoodsName(goodsName);
        return goodsMapper.insertGoods(goods);
    }
}
