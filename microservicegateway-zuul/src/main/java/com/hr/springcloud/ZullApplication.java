package com.hr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 刘焕燃 🐇
 * @date 2021/2/20 9:29
 */
@SpringBootApplication
@EnableZuulProxy // 注解开启zuul的api网关功能
@EnableEurekaClient // 注册服务
public class ZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class,args);
    }
}
