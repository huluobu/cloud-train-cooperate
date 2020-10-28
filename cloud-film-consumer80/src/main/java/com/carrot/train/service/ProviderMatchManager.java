package com.carrot.train.service;

import com.carrot.testcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-Match-provider")
public interface ProviderMatchManager {

    @RequestMapping(value = "manager/match/list")
    public CommonResult toList();
}
