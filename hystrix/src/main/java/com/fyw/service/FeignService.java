package com.fyw.service;

import com.fyw.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by fyw on 2019/8/2.
 *
 * @FeignClient注解value值是指要调用的提供者服务名、fallback属性是指溶断机制的降级处理实现类
 */
@FeignClient(value = "provider", fallback = FeignServiceImpl.class)
public interface FeignService {
    @GetMapping("/studentController/findAll")
    Map findAll();

    @GetMapping("/studentController/getPort")
    String index();
}
