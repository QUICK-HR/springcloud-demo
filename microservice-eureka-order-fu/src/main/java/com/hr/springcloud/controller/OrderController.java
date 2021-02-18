package com.hr.springcloud.controller;

import com.hr.springcloud.po.Order;
import com.hr.springcloud.util.ServiceInfoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘焕燃 🐇
 * @date 2021/2/18 17:13
 */
@RestController
public class OrderController {
    /**
     * 通过订单id查询订单信息
     */
    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id){
        Order order = new Order();
        order.setId("123");
        order.setPrice(23.5);
        order.setReceiverAdress("beijing");
        order.setReceiverName("xiaoqiang");
        order.setReceiverPhone("18326362275");
        System.out.println(ServiceInfoUtil.getPort());
        return order.toString();
    }
}
