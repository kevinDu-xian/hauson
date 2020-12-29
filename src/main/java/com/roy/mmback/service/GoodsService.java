package com.roy.mmback.service;

import com.roy.mmback.beans.po.Goods;

import java.util.List;

public interface GoodsService {
    public Goods getById(int id);
    public List<Goods> getGoodsList(Goods goods);
}
