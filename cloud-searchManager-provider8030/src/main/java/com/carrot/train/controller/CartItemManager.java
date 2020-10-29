package com.carrot.train.controller;

import com.carrot.testcloud.entities.CommonResult;
import com.carrot.train.dao.CartItemRepository;
import com.carrot.train.entities.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author: carrot
 * @Date: 2020/10/29 14:08
 * @Description:
 */
@RequestMapping("/cart")
@RestController
public class CartItemManager {
    private static final String CAR_INDEX_NAME = "cartindex";
    private static final String CAR_INDEX_TYPE = "cartitem";

//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private CartItemRepository cartItemRepository;

    @RequestMapping("/additem")
    public CommonResult addCartItem() {
        CommonResult result = new CommonResult();
        CartItem cartItem = new CartItem(1, 1,"动作", 2, "13", new BigDecimal(71));
        CartItem recartitem = cartItemRepository.save(cartItem);
        result.setData(recartitem);
        result.setCode(00000);
        result.setMessage("success");
        return result;
    }

    @RequestMapping("/query")
    public CommonResult queryCartItemById() {
        CommonResult result = new CommonResult();
        CartItem recartitem = cartItemRepository.queryCartItemById("1");
        result.setData(recartitem);
        result.setCode(00000);
        result.setMessage("success");
        return result;
    }
}
