package com.roy.mmback.dao;

import com.roy.mmback.beans.po.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    /**
     * 通过ID查询商品信息
     * @param id
     * @return
     */
    public Goods getById(int id);

    /**
     * 查询所有商品信息
     * @param goods
     * @return
     */
    public List<Goods> getGoodsList(Goods goods);
}
