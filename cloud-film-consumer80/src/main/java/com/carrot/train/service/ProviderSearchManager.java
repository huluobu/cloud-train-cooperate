package com.carrot.train.service;


import cn.hutool.json.JSONObject;
import com.carrot.testcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-Search-provider")
public interface ProviderSearchManager {

    @RequestMapping(value = "cart/query")
    CommonResult querySearch(@RequestBody JSONObject jsonObject);
}
