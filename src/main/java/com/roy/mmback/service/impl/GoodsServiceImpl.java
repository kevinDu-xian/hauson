package com.roy.mmback.service.impl;

import com.roy.mmback.beans.po.Goods;
import com.roy.mmback.dao.GoodsDao;
import com.roy.mmback.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;


    @Override
    public Goods getById(int id) {
        return goodsDao.getById(id);
    }

    @Override
    public List<Goods> getGoodsList(Goods goods) {
        return goodsDao.getGoodsList(goods);
    }
}
