package com.carrot.train.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.carrot.testcloud.entities.CommonResult;
import com.carrot.train.entity.FilmMatch;
import com.carrot.train.service.ProviderMatchManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: carrot
 * @Date: 2020/10/27 11:08
 * @Description:
 */
@RequestMapping("consumer/manager/match")
@Controller
public class MatchConsumerController {
    @Resource
    private ProviderMatchManager providerMatchManager;

    @RequestMapping("/list")
    public String toFilmList(HttpServletRequest request) {
        CommonResult result = providerMatchManager.toList();
        System.out.println(result);
        List<Object> objectList = (List<Object>)result.getData();
        List<FilmMatch> list =new ArrayList<FilmMatch>();
        for (Object ob : objectList) {
            JSONObject jsonObject = new JSONObject(ob);
            FilmMatch filmMatch = JSONUtil.toBean(jsonObject, FilmMatch.class);
            list.add(filmMatch);
        }
        request.setAttribute("filmMatchList",list);
        return "pages/manager/filmmatch_manager";
    }
}
