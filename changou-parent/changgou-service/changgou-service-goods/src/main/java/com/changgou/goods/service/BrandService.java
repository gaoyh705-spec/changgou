package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;

import java.util.List;

public interface BrandService {
    /***
     * 查询所有品牌
     * @return
     */
    List<Brand> findAll();
}