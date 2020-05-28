package com.fyw.controller;

import com.fyw.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by fyw on 2019/8/2.
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    FeignService feignService;

    @GetMapping("/findAll")
    public Map findAll() {
        return feignService.findAll();
    }

    @GetMapping("/getPort")
    public String index() {
        return feignService.index();
    }
}
