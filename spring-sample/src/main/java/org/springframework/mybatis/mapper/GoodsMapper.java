package org.springframework.mybatis.mapper;

import org.springframework.mybatis.entity.Goods;

public interface GoodsMapper {

    /**
     * 订单插入
     * @param goods
     * @return
     */
    int insertGoods(Goods goods);

}
