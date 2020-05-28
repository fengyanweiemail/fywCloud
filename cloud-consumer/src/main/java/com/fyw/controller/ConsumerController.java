package com.fyw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fyw on 2019/7/30.
 */
@RestController
@RequestMapping("/consumerController")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Map findAll() {
        return restTemplate.getForObject("http://provider/studentController/findAll", HashMap.class);
    }

    @GetMapping("/getPort")
    public String getPort() {
        return restTemplate.getForObject("http://provider/studentController/getPort", String.class);

    }

    @GetMapping("/port")
    public String getport() {
        //String str = restTemplate.getForObject("http://provider/studentController/getPort", String.class);
        //return "消费者：" + port + "---提供者：" + str;
        return "消费者：" + port + "---提供者：";
    }
}
