package com.roy.mmback.controller;

import com.roy.mmback.beans.po.Goods;
import com.roy.mmback.beans.vo.ResultVO;
import com.roy.mmback.service.GoodsService;
import com.roy.mmback.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/goods",produces = "text/html;charset=utf-8")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查询所有商品信息
     * @param goods
     * @return
     */
    @GetMapping("getGoodsList")
    public String getGoodsList(Goods goods){
        ResultVO<Goods> resultVO =new ResultVO<Goods>("4001","查询失败");

        List<Goods> goodsList=goodsService.getGoodsList(goods);

        if(goodsList !=null && goodsList.size()>0){
            resultVO.setCode("2001");
            resultVO.setMsg("查询成功");
            resultVO.setData(goodsList);
        }

        return JsonUtil.toJsonString(resultVO);
    }
}
