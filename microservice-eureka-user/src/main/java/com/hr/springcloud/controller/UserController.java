package com.hr.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @HystrixCommand
 * 注解指定了当前方法发生异常调用的方法，相当于一个短路保护器一个服务阻断了，也不会影响其他服务正常运行
 * 但是回调方法与注解保护的方法的返回值以及参数类型必须保持一致
 * @author 刘焕燃 🐇
 * @date 2021/2/18 17:36
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查找与用户相关的订单
     */
    @GetMapping("/findOrdersByUser/{id}")
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findOrdersByUser(@PathVariable String id) {
        int oid = 123;// 假设用户只有一个订单，并且订单id为123
        return this.restTemplate.getForObject("http://microservice-eureka-order:8001/order/" + oid,String.class);
    }
    /**
     * 返回信息方法
     */
    public String fallbackInfo(@PathVariable String id){
        return "服务不可用，请稍后再试";
    }
}
