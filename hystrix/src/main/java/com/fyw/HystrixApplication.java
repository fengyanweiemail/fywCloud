package com.fyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by fyw on 2019/8/3.
 *
 * @EnableCircuitBreaker 声明启动数据监视话
 * @EnableHystrixDashboard 声明可视化的数据监控
 * (访问路径：http://localhost:8090/actuator/hystrix.stream)--actuator提供的监控数据节点，非可视化界面的
 * 可视化界面的访问路径 http://localhost:8090/hystrix
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
