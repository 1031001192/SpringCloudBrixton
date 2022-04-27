package com.use;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: Test
 * @Title: Test
 * @Package com.use
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/27 20:43
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigUseApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigUseApplication.class).web(true).run(args);
    }
}
