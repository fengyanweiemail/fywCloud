package com.fyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by fyw on 2019/7/30.
 *
 * @EnableZuulProxy 包含了@EnableZuulService
 * @EnableAutoConfiguration自动注入所有满足条件的配置类
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
