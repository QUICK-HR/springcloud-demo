package com.hr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘焕燃 🐇
 * @date 2021/2/18 16:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 开启断路器功能
public class Application {
    @GetMapping("/hello")
    public String home(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
