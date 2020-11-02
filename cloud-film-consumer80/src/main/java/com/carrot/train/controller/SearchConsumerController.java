package com.carrot.train.controller;

import cn.hutool.json.JSONObject;
import com.carrot.testcloud.entities.CommonResult;
import com.carrot.train.service.ProviderMatchManager;
import com.carrot.train.service.ProviderSearchManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: carrot
 * @Date: 2020/11/2 09:35
 * @Description:
 */
@RequestMapping("consumer/search")
@RestController
public class SearchConsumerController {
    @Resource
    private ProviderSearchManager providerSearchManager;


    @RequestMapping("/query")
    public CommonResult queryCartItem(@RequestBody JSONObject jsonObject) {
        CommonResult result = providerSearchManager.querySearch(jsonObject);
        return result;
    }

}
