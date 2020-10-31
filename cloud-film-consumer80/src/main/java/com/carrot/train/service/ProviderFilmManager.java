package com.carrot.train.service;

import com.carrot.testcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @Author: carrot
 * @Date: 2020/10/25 9:12
 */
@Component
@FeignClient(name = "cloud-film-provider")
public interface ProviderFilmManager {

    @RequestMapping(value = "home")
    public CommonResult toHomepage();

    @RequestMapping(value = "manager/film/list")
    public CommonResult toList();

    @RequestMapping(value = "manager/film/query")
    public CommonResult toQuery(@RequestBody HashMap<String, Object> map);

    @RequestMapping(value = "manager/film/update")
    public CommonResult toUpdate(@RequestBody HashMap<String, Object> map);

    @RequestMapping(value = "manager/film/add")
    public CommonResult toAdd(@RequestBody HashMap<String, Object> map);

    @RequestMapping(value = "manager/film/delete")
    public CommonResult toDelete(@RequestBody HashMap<String, Object> map);


}
