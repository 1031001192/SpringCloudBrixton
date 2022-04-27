package com.cloud.consume.controller;

import com.cloud.consume.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: Test
 * @Title: Test
 * @Package com.cloud.consume.controller
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/27 20:43
 */
@RestController
public class RibbonApplication {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add() {
//        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
//    }
}
