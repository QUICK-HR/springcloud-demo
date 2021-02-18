package com.hr.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author 刘焕燃 🐇
 * @date 2021/2/18 17:17
 */
@Component
public class TemplateConfig {
    /**
     * restTemplate是spring提供的用于访问rest服务客户端实例，它提供多种便捷访问远程http服务的方法
     * @Param LoadBalanced ribon提供的负载均衡所做的策略
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
