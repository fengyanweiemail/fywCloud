package com.fyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fyw on 2019/7/30.
 */
@SpringBootApplication
public class ConsumerApplicationA {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationA.class, args);
    }

    /**
     * @return
     * @LoadBalanced ribbon负载均衡的注解
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
