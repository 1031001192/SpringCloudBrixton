package com.zuul;

import com.zuul.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @Description: Test
 * @Title: Test
 * @Package com.zuul
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/27 20:43
 */
@EnableZuulProxy
@SpringCloudApplication//使用这个注解简化配置 它整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
public class ZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }

    /**
     * 注入过滤器
     * */
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
