package org.springframework.mybatis.service;

/**
 * 我的购物车
 */
public interface CatService {

    void addCat(String userId, double price, String goodsName);

}
