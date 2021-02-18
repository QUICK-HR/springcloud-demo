package com.hr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 刘焕燃 🐇
 * @date 2021/2/18 21:50
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class,args);
    }
}
