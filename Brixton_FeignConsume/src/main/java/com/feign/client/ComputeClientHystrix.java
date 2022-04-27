package com.feign.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: Test
 * @Title: Test
 * @Package com.feign.client
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/27 20:43
 */
@Component
public class ComputeClientHystrix implements ComputeClient{

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
