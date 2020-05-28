package com.fyw.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/restTemplateController")
public class RestTemplateController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Map findAll() {
        return restTemplate.getForObject("http://provider/studentController/findAll", HashMap.class);
    }

    @GetMapping("/getPort")
    public String getPort() {
        return restTemplate.getForObject("http://localhost:8010/studentController/getPort", String.class);

    }
}
